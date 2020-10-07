package com.company;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static <e> void main(String[] args) {
        Set<Student> stud = new HashSet<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите информацию о студнте: \"ФИО, номер группы, номер студенческого билета\"");
            System.out.println("(для завершения работы программы введите \"end\")");
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }

            String[] info = input.split(", ");
            Student student = new Student(info[0], info[1], info[2]);

            if (!stud.contains((student))) {
                stud.add(student);
            } else {
                System.out.println("Номер студенческого билета не может повторятся. Введите данные еще раз.");
            }
        }

        System.out.println("Список студентов:");

        for (Student s : stud) {
            System.out.println(s);
        }
    }
}