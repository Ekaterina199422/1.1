package com.company.users;

package users;

import book.Book;
import duties.Reader;

public class ReaderUser extends User implements Reader {
    private static int bookInUse  = 0;
    private Book[] myBooks = new Book[MAX_BOOKS];

    public ReaderUser(String name) {
        super(name);
    }

    @Override
    public boolean takeBook(Book book) {
        if(bookInUse < MAX_BOOKS){
            myBooks[bookInUse] = book;
            bookInUse++;
            return true;
        } else{
            return false;
        }
    }

    @Override
    public boolean returnBook(Book book) {
        for (int i = 0; i < bookInUse; i++) {
            if(book.equals(myBooks[i])){
                for (int j = i; j <bookInUse ; j++) {
                    myBooks[j] = myBooks[j+1];
                }
                bookInUse--;
                return true;}
        }
        return false;
    }
}
