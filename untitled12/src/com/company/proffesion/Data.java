package com.company.proffesion;

public class DatabaseEngineer extends Engineer implements Databases {
    @Override
    public void designTables() {
        System.out.println("designTables");
    }

    @Override
    public void makeQuery() {
        System.out.println("makeQuery");
    }

    @Override
    public void doProgramming() {
        System.out.println("sql");
    }
}
