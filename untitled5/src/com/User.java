package com;

public class User {


    static int totalOnline;

    String email;
    String name;
    String surname;
    Book book;

    public User(String email, String name, String surname, Book book) {
        this.email = email;
        this.name = name;
        this.surname = surname;
        this.book = book;
        totalOnline++;
    }

    public String toString() {
        return "Email:"+ email + ", " + name + " " + surname +"book name"+ book.nameBook + "author" + book.author.surname;
    }

    public static int sumTotalOnline() {
        return totalOnline;


    }
}