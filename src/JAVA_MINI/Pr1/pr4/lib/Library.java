package JAVA_MINI.Pr1.pr4.lib;

import JAVA_MINI.Pr1.pr4.book.Book;

public class Library {

    private String name;     // название библиотеки
    private Book[] books;    // массив книг
    private int bookCount;   // сколько книг сейчас добавлено

    public Library(String name, int maxCountBooks) {
        books = new Book[maxCountBooks];
        this.name = name;
    }

    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount += 1;
        } else {
            System.out.println("ОШИБКА: Нельзя добавлять, максимальная вместимость достигнута!");
        }

    }

    public void findByAuthor(String author) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getAuthor().equals(author)) {
                System.out.println(books[i].getInfo());
            }
        }
    }


    public void printAvailable() {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].isAvailable()) {
                System.out.println(books[i].getInfo());
            }
        }
    }

    public void getStats() {
        int availableCount = 0;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].isAvailable()) {
                availableCount++;
            }
        }
        System.out.println("Библиотека " + '"' + name + '"');
        System.out.println("Всего книг: " + bookCount);
        System.out.println("Доступно: " + availableCount);
        System.out.println("Выдано: " + (bookCount - availableCount));
    }

    public Book getBestBook() {
        Book bestBook = null;
        int bestRating = 0;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getRating() > bestRating) {
                bestRating = books[i].getRating();
                bestBook = books[i];
            }
        }
        return bestBook;
    }
}
