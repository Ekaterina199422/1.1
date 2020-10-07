package com.company;

public class Patent {
    String number;
    String company;
    String author;
    int year;
    String description;

    public void Patent(String number, String company, String author, int year, String description) {
        this.number = number;
        this.company = company;
        this.author = author;
        this.year = year;
        this.description = description;
    }
        @Override
        public String toString () {
            return String.format("номер: %s, компания: %s, автор: %s, дата: %s, описание: %s", number, company, author,
                    year, description);
        }
    }
