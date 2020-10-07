package com.company.users;

package users;

import book.Book;
import duties.*;

import static book.Books.books;
import static java.time.LocalDate.now;

public class ReserveEmployer extends User implements Administrator, Librarian {

    public ReserveEmployer(String name){
        super(name);
    };

    @Override
    public boolean findBook(Book newBook) {

        for (Book book : books) {
            if (book != null && newBook.equals(book)){
                return true;}
        }
        return false;
    }

    @Override
    public void disposeBook(Book book, Reader reader) {
        book.setReader(reader);
        book.setReturnDate(now().plusDays(LENGTH_USE));
    }

    @Override
    public void overdueNotification(Book[] books) {
        for (Book book: books) {
            if(book != null && now().isAfter(book.getReturnDate())){
                System.out.println("книга "+ book.getName() + " просрочена(" + book.getReturnDate().toString()
                        + ") читателем " + book.getReader().toString());
            }
        }
    }

    @Override
    public boolean orderBook(Book book, Supplier kurier) {
        for (int i = 0; i < books.length ; i++) {
            if(books[i] == null){
                while (!kurier.deliveryBook(book));  //ждем доставеи
                books[i] =book;
                return true;
            }
        }
        return false; // библиотека переполнена
    }
}
