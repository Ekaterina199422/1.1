package com.company;



public class Main {
    public static void main(String[] args) {
        Engineer[] engineers = {
                new DatabaseEngineer(),
                new JavaDeveloper(),
                new FrontEndDeveloper()
        };

        for (Engineer engineer : engineers) {
            engineer.doProgramming();
        }

        Java javaDev = new JavaDeveloper();
        javaDev.codeJava();

        ( (Databases)javaDev).makeQuery();
    }
}
