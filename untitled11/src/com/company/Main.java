package com.company;
import book.Book;
import users.*;
import duties.*;
import static book.Books.books;
import java.util.Scanner;


public class Main {
    public static int booksCount = 0;

    public static void main(String[] args) {

        AdministratorUser admin = new AdministratorUser("Бойко");
        LibrarianUser bibliotekar = new LibrarianUser("Васильевна");
        ReserveEmployer reserver = new ReserveEmployer("Машенька");
        SupplierUser kurier = new SupplierUser("Алексей");
        ReaderUser chitatel = new ReaderUser("Петя");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Какую книгу выдать?");
        Book book = new Book(scanner.nextLine());

        System.out.println(admin.getName() + ":");
        if (admin.findBook(book) && book.getReturnDate() == null) {
            putBook(admin, chitatel, book);
        } else { // книги нет в библиотеке
            if (bibliotekar.orderBook(book, kurier)) {
                System.out.println("книга " + book.getName() + " получена");
                putBook(admin, chitatel, book);
            } else {
                System.out.println("книга " + book.getName() + "не получена");
            }
        }

        admin.overdueNotification(books);

        System.out.println(reserver.getName() + ":");
        if (reserver.findBook(book)){
            if( book.getReturnDate() == null) {
                putBook(reserver, chitatel, book);
            } else {
                System.out.println("книга " + book.getName() + " занята до " +
                        book.getReturnDate().toString());
            }
        }else {
            System.out.println("книга " + book.getName() + " не получена");
        }

        if (chitatel.returnBook(book)){
            book.setReader(null);
            book.setReturnDate(null);
            System.out.println(book.getName() + " возвращена");
        }
    }

    private static void putBook(Administrator admin, ReaderUser chitatel, Book book) {
        admin.disposeBook(book, chitatel);
        if(chitatel.takeBook(book)){
            System.out.println("Читателю " + chitatel.getName()
                    + " выдана книга " + book.getName() + " до " + book.getReturnDate());
        } else{
            System.out.println("Читателю " + chitatel.getName()
                    + " не выдана книга " + book.getName());
        }
    }

}
