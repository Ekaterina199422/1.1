package com.company;

import com.company.Book;

public class Main {
    public static void main(String[] args) {


        Book book = new Book("Гарри Поттер");

        FromAvailableStatusMover fromAvailableStatusMover = new FromAvailableStatusMover();
        FromArchievedStatusMover fromArchievedStatusMover = new FromArchievedStatusMover();
        FromBorrowedStatusMover fromBorrowedStatusMover = new FromBorrowedStatusMover();
        FromOverduedStatusMover fromOverduedStatusMover = new FromOverduedStatusMover();

        System.out.println(book.getStatus());
        System.out.println("----------------------");
        System.out.println("Перевод...");

        fromAvailableStatusMover.moveToStatus(book, StatusEnum.BORROWED);
        System.out.println(book.getStatus());
        fromBorrowedStatusMover.moveToStatus(book, StatusEnum.ARCHIVED);
        System.out.println(book.getStatus());
        fromArchievedStatusMover.moveToStatus(book, StatusEnum.AVAILABLE);
        System.out.println(book.getStatus());

    }
}
