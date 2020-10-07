package com.company.dutles;
package duties;

import book.Book;
public interface Administrator {
    long  LENGTH_USE = 10;
    boolean findBook(Book book);
    void disposeBook(Book book, Reader reader);
    void overdueNotification(Book[] book);
}
