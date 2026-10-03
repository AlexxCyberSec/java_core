package JAVA_MINI.Pr1.pr4.lib;

import JAVA_MINI.Pr1.pr4.book.Book;

public class Library {

    private String name;
    private Book[] books;
    private int bookCount;

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
        if (author != null && !author.isEmpty()) {
            for (int i = 0; i < bookCount; i++) {
                if (author.equals(books[i].getAuthor())) {
                    System.out.println(books[i].getInfo());
                }
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
        if (bookCount == 0) {
            return null;
        }

        Book bestBook = books[0];          // предположили, что лучшая — первая
        for (int i = 1; i < bookCount; i++) {   // начинаем с 1, не с 0
            if (books[i].getRating() > bestBook.getRating()) {
                bestBook = books[i];
            }
        }
        return bestBook;
    }
}
