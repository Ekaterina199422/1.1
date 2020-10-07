package com.company;

import Author.java.Author;
import com.User;

import java.awt.print.Book;
import java.time.LocalDate;

class Main {
    

    public static void main(String[] args) {


    
        Book book = new Book(author, "Рассказы из одного кармана", 354, LocalDate.parse("1974-06-05"));
        author = new Author("Karel", "Capek", LocalDate.parse("1890-01-09"), "Чехия");


        Book book2 = new Book(author, "Скотный двор", 128, LocalDate.parse("1945-08-17"));
        Author author2 = new Author("George", "Orwell", LocalDate.parse("1903-06-25"), "Индия");

        Book.pagesMax = Math.max(book.pages, Book.pagesMax);
        book.page();

        User user = new User("Ivanov.van@mail.ru", "Иван", "Луговой", book);
        User user2 = new User("Anna.Axmatova@mail.ru", "Анна", "Цветкова", book);
        User user3 = new User("Kiril.Romanov@mail.ru", "Кирил", "Романов", book);


        System.out.println("_________________________________");
        System.out.printf("%s%n%s%n", book, author);
        System.out.println(" ");
        System.out.printf("%s%n%s%n", book2, author2);
        System.out.println("__________________________________");
        System.out.println(user);
        System.out.println(user2);
        System.out.println(user3);

        System.out.printf("%s%n%s%n", "_________________", "Online:" + User.totalOnline + " человек(а)");

    }

    }

