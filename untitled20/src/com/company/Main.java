package com.company;



import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PhoneContacts phoneContacts = new PhoneContacts();

        System.out.println("Введите название группы контактов:");


        while (true) {
            String input = scanner.nextLine();

            if ("нет".equals(input)) {
                break;
            }

            phoneContacts.addGroup(input);
            System.out.println("Создать еще одну группу (введите название или введите нет)?");
        }

        while (true) {
            System.out.println("Создать контакт (введите наименование и его номер или введите нет)?");
            String input = scanner.nextLine();

            if ("нет".equals(input)) {
                break;
            }

            try {
                String[] Values = input.split(" ");
                String phone = Values[Values.length - 1];
                StringBuffer name = new StringBuffer();

                for (int i = 0; i < Values.length - 2; i++) {
                    name.append(Values[i]);
                    name.append(" ");
                }

                name.append(Values[Values.length - 2]);
                Contact contact = new Contact(name.toString(), phone);

                System.out.println("Укажите группы контакта через пробел");
                String valu = scanner.nextLine();

                for (String group: valu.split(" ")) {
                    phoneContacts.addContactToGroup(group, contact);
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Введите имя и номер телефона через пробел");
            }
        }
        phoneContacts.showInfo();
    }
}
