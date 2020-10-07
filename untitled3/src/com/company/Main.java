package com.company;

import java.util.Scanner;
class Main {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String input= scanner.nextLine();
        input = input.trim();
        System.out.println("Пробелы удалены");
        String result = input.replaceAll("(\\s+)" , " ");
        System.out.println(result);

    }

    static String extraTrim(String input) {

        return "String input";