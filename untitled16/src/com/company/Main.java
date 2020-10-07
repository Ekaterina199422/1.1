package com.company;
import com.sun.deploy.security.SelectableSecurityManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> arrayList = new ArrayList<>();
        int number;

        while (true) {
            String task = scanner.nextLine();
            if (task.equalsIgnoreCase("end")) {


                System.out.println("Выберите действие:\n" +
                        "1. Добавить задачу\n" +
                        "2. Вывести список задач\n" +
                        "3. Удалить задачу\n" +
                        "0. Выход");
                try {
                    number = (Integer.parseInt(scanner.nextLine()));
                    switch (number) {
                        case 1:
                            number = 1;
                            System.out.println("Введите название задачи");
                            arrayList.add(scanner.nextLine());
                            break;
                        case 2:
                            number = 2;
                            for (int i = 0; i < arrayList.size(); i++) {
                                System.out.println("#" + (i + 1) + " " + arrayList.get(i));
                            }
                            break;
                        case 3:
                            number = 3;
                            System.out.println("Введите номер задачи, которую нужно удалить из списка, или finish для завершения редактирования");
                            String input = scanner.nextLine();
                            int index = Integer.parseInt(input);
                            arrayList.remove(index);
                            for (String zadacha : arrayList) {
                                System.out.println(zadacha);
                            }
                            if (input.equalsIgnoreCase("finish")) {
                                System.out.println("Список дел отредактирован");
                            }
                            break;
                        case 4:
                            number = 0;
                            System.out.println("Список дел отредактирован");
                            break;
                    }
                } finally {

                }
                }
            }
        }
    }










