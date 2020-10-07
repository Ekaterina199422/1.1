package com.company;

enum Group {
    WORK("Работа"),
    FRIENDS("Друзья"),
    FAMILY("Семья");

    String name;

    Group(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}