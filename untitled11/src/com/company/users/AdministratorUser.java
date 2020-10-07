package com.company.users;

import com.company.dutles.Administrator;
package users;

import duties.*;
import book.Book;
import static book.Books.books;
import static java.time.LocalDate.now;


public class AdministratorUser extends ReaderUser implements Administrator {

    public AdministratorUser(String name){
        super(name);
    };

    @Override
    public boolean findBook(Book newBook) {
        for (Book book : books) {
            if (book != null && newBook.equals(book))
                return true;
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


}
