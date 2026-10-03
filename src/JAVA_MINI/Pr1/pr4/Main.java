package JAVA_MINI.Pr1.pr4;

import JAVA_MINI.Pr1.pr4.book.Book;
import JAVA_MINI.Pr1.pr4.lib.Library;

public class Main {
    public static void main(String[] args) {

        Library libChitayGorod = new Library("Читай город", 5);

        Book bookMasterMargarita = new Book("Мастер и Маргарита", "Булгаков М.", 1967, 1);
        Book bookPrestuplNakaz = new Book("Преступление и наказание", "Достоевский Ф.", 1866, 2);
        Book bookWarPeace = new Book("Война и мир", "Толстой Л.", 1869, 5);
        Book bookIdiot = new Book("Идиот", "Достоевский Ф.", 1869, 3);
        Book bookDogHeart = new Book("Собачье сердце", "Булгаков М.", 1925, 4);

        libChitayGorod.addBook(bookMasterMargarita);
        libChitayGorod.addBook(bookPrestuplNakaz);
        libChitayGorod.addBook(bookWarPeace);
        libChitayGorod.addBook(bookIdiot);
        libChitayGorod.addBook(bookDogHeart);

        bookMasterMargarita.borrow();
        bookPrestuplNakaz.borrow();
        bookWarPeace.borrow();

        bookMasterMargarita.returnBook();

        libChitayGorod.printAvailable();

        libChitayGorod.findByAuthor("Достоевский Ф.");

        libChitayGorod.getStats();


        //для примера - нельзя добавлять книг больше указанного объема + рейтинг
        Book book6 = new Book("Тест", "Тест", 2067, 10);
        libChitayGorod.addBook(book6);

        Book best = libChitayGorod.getBestBook();
        if (best != null) {
            System.out.println("Лучшая книга: " + best.getInfo());
        } else {
            System.out.println("Библиотека пуста");
        }

    }
}
