package com.company.book;
package book;

import duties.Reader;

import java.time.LocalDate;

public class Book {
    private String name;
    private LocalDate returnDate;

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Reader getReader() {
        return reader;
    }

    private Reader reader;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj.getClass() != this.getClass())
            return false;
        return this.getName().equals(((Book)obj).getName());
    }
}
