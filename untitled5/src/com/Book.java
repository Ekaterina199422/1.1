package com;



import Author.java.Author;

import java.time.LocalDate;

public class Book {

    public static int pagesMax;

    Author author;
    String nameBook;
    int pages;
    LocalDate year;


    public Book(Author author, String nameBook, int pages, LocalDate year) {
        this.author = author;
        this.nameBook = nameBook;
        this.pages = pages;
        this.year = year;
        pagesMax = Math.max(pages, pagesMax);
    }

    public void page()  {
        System.out.println("Самая большая книга: " + pagesMax + " страниц(а)");
    }

    public String toString() {
        return author + " " + "\"" + nameBook + "\"" + "" + ", " +"количество страниц: " + pages + ", " + "год издания:"+ " " + year;
    }
}