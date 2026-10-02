package JAVA_MINI.Pr1.pr4.book;

public class Book {
    private String title;       // название
    private String author;      // автор
    private int year;           // год издания
    private boolean isAvailable; // доступна ли книга
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
        return '"' + title + '"' + " - " + author + " (" + year + ") " + "[" + (isAvailable ? "Доступна" : "Выдана") + "] " + "Рейтинг: " + getRating();
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
