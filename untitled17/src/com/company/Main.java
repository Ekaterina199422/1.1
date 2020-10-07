package com.company;

import java.util.ArrayList;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();

        int number;

        while (true) {
            String task = scanner.nextLine();
            arrayList.add(scanner.nextLine());
            if (task.equalsIgnoreCase("end")) {
                System.out.printf("У вас %s дел(а):\n", arrayList.size());
            }
            System.out.println("Выберите действие:\n" +
                    "1. Добавить задачу\n" +
                    "2. Вывести список задач\n" +
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
                            System.out.println((i + 1) + " " + arrayList.get(i));
                        }
                        break;
                    case 3:
                        System.out.println("Введите номер задачи, которую нужно удалить из списка, или finish для завершения редактирования");

                        String input = scanner.nextLine();
                        if (input.equalsIgnoreCase("finish")) {
                            for (int i = 0; i < arrayList.size(); i++) {
                                System.out.println((i + 1) + " " + arrayList.get(i));
                                input = scanner.nextLine();
                                break;

                            }
                            int index = Integer.parseInt(input);
                            arrayList.remove(index);


                        }
                        break;
                    case 4:
                        number = 0;
                        break;
                }
                if (number == 0) {
                    break;
                }
            } finally {
            }
        }
    }
}






