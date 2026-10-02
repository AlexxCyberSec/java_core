package JAVA_MINI.Pr1.pr4;

import JAVA_MINI.Pr1.pr4.book.Book;
import JAVA_MINI.Pr1.pr4.lib.Library;

public class Main {
    public static void main(String[] args) {

        Library lib1 = new Library("Читай город", 5);

        Book book1 = new Book("Мастер и Маргарита", "Булгаков М.", 1967, 1);
        Book book2 = new Book("Преступление и наказание", "Достоевский Ф.", 1866, 2);
        Book book3 = new Book("Война и мир", "Толстой Л.", 1869, 5);
        Book book4 = new Book("Идиот", "Достоевский Ф.", 1869, 3);
        Book book5 = new Book("Собачье сердце", "Булгаков М.", 1925, 4);

        lib1.addBook(book1);
        lib1.addBook(book2);
        lib1.addBook(book3);
        lib1.addBook(book4);
        lib1.addBook(book5);

        book1.borrow();
        book2.borrow();
        book3.borrow();

        book1.returnBook();

        lib1.printAvailable();

        lib1.findByAuthor("Достоевский Ф.");

        lib1.getStats();


        //для примера - нельзя добавлять книг больше указанного объема + рейтинг
        Book book6 = new Book("Тест", "Тест", 2067, 10);
        lib1.addBook(book6);

        Book best = lib1.getBestBook();
        if (best != null) {
            System.out.println("Лучшая книга: " + best.getInfo());
        } else {
            System.out.println("Библиотека пуста");
        }

    }
}
