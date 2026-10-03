package JAVA_MINI.Pr1.pr4.book;

public class Book {
    private String title;
    private String author;
    private int year;
    private boolean isAvailable;
    private int rating;

    public Book(String title, String author, int year, int rating) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = true;
        setRating(rating);
    }

    public boolean borrow() {
        if (isAvailable) {
            isAvailable = false;
            return true;
        }
        return false;
    }

    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
        }
    }

    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append('"').append(title).append('"');
        sb.append(" - ").append(author);
        sb.append(" (").append(year).append(") ");
        sb.append("[").append(isAvailable ? "Доступна" : "Выдана").append("] ");
        sb.append("Рейтинг: ").append(getRating());
        return sb.toString();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title != null && !title.isEmpty()) {
            this.title = title;
        }
    }

    public boolean isAvailable() {
        return isAvailable;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author != null && !author.isEmpty()) {
            this.author = author;
        } else {
            System.out.println("ОШИБКА: Нет автора.");
        }
    }

    public int getYear() {
        return year;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        if (rating >= 1 && rating <= 5) {
            this.rating = rating;
        } else {
            System.out.println("ОШИБКА: Недопустимое значение рейтинга!");
        }
    }
}
