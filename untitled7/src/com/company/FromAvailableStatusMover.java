package com.company;

import com.company.Book;
import com.company.BookMover;

public class FromAvailableStatusMover extends BookMover {

    @Override
    public void moveToStatus(Book book, StatusEnum requestedStatus) {
        if (book.getStatus() == StatusEnum.AVAILABLE) {
            switch (requestedStatus) {
                case StatusEnum.BORROWED:
                    book.setStatus(requestedStatus);
                    break;
                case StatusEnum.ARCHIVED:
                    book.setStatus(requestedStatus);
                    break;
                default:
                    System.out.println("Перевод книги из статуса " + book.getStatus() + " в статус " + requestedStatus);
                    break;
            }
        }
    }
}
