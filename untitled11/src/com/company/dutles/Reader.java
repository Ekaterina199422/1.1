package com.company.dutles;
package duties;

import book.Book;
public interface Reader {
    int MAX_BOOKS = 10;
    boolean takeBook(Book book);
    boolean returnBook(Book book);
}
