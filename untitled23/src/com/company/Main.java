package com.company;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        PhoneContacts contacts = new PhoneContacts();
        MissedCalls missedCalls = new MissedCalls();
        String input = "";
        System.out.println("Программа: пропущенные вызовы.");
        menu();

        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine().replaceAll("\\p{P}", "");
        while (!input.equals("5")) {
            switch (input) {
                case "1":

                    Contact contact = new Contact();
                    System.out.println("Введите имя:");
                    contact.setName(scanner.nextLine());
                    System.out.println("Введите фамилию:");
                    contact.setSurname(scanner.nextLine());
                    System.out.println("Введите номер телефона:");
                    contact.setPhone(scanner.nextLine());
                    System.out.println("Введите группу:");
                    String inGroup = scanner.nextLine();
                    if (inGroup.equals("WORK")) {
                        contact.setGroup(Group.WORK);
                    } else if (inGroup.equals("FRIENDS")) {
                        contact.setGroup(Group.FRIENDS);
                    } else if (inGroup.equals("FAMILY")) {
                        contact.setGroup(Group.FAMILY);
                    } else {
                        System.out.println("Введенная вами группа не существует");
                    }
                    contacts.addContact(contact.getPhone(), contact);
                    break;
                case "2":
                    System.out.println("Введите номер телефона пропущенного звонка:");
                    missedCalls.addMissedCall(scanner.nextLine());
                    break;
                case "3":
                    System.out.println("Список пропущенных звонков:");
                    Map<String, Contact> mapContacts = contacts.getContacts();
                    missedCalls.getAllMissedCalled(mapContacts);
                    break;
                case "4":
                    missedCalls.clear();
                    break;
            }
            menu();
            input = scanner.nextLine().replaceAll("\\p{P}", "");
        }
    }

    private static void menu() {
        System.out.println("Меню:\n" +
                "1. Добавить контакт\n" +
                "2. Добавить пропущенный вызов\n" +
                "3. Вывести все пропущенные вызовы\n" +
                "4. Очистить пропущенные вызовы\n" +
                "5. Выход");
        System.out.println("Выберите пункт из меню (1-5):");
    }
}