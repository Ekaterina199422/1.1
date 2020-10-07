package com.company;

import com.company.Book;
import com.company.BookMover;

public class FromArchievedStatusMover extends BookMover {

    @Override
    public void moveToStatus(Book book, StatusEnum requestedStatus) {
        if (book.getStatus() == StatusEnum.ARCHIVED) {
            switch (requestedStatus) {
                case StatusEnum.AVAILABLE:
                    book.setStatus(requestedStatus);
                    break;
                default:
                    System.out.println("Перевод книги из статуса " + book.getStatus() + " в статус " + requestedStatus);
                    break;
            }
        }
    }
}
