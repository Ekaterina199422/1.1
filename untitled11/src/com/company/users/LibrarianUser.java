package com.company.users;

package users;

import book.*;
import duties.*;
import static book.Books.books;


public class LibrarianUser extends ReaderUser implements Librarian{

    public LibrarianUser(String name) {
        super(name);
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

