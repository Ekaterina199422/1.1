package com.company;
import java.util.*;
public class Main {

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                Queue<Integer> elevator = new LinkedList<>();
                int floor;
                int waitDoorsInSeconds = 10, waitMoveInSeconds = 5;

                System.out.println("Введите номер этажа (для завершения введите 0)");

                while (true) {
                    floor = scanner.nextInt();
                    System.out.println("Ожидаю ввода следующего этажа: (для завершения введите 0)");

                    if (floor <= 25 && floor > -1) {
                        elevator.add(floor);
                    }else{
                        System.out.println("Введен недопустимый этаж");
                    }
                    if (floor == 0) {
                        break;
                    }

                }

                int previousFloor = 0;
                int currentFloor = 0;
                int totalSeconds = 0;
                Iterator it = elevator.iterator();
                while (it.hasNext()) {
                    totalSeconds += waitDoorsInSeconds;
                    currentFloor = (int)it.next();
                    totalSeconds += Math.abs(currentFloor - previousFloor)*waitMoveInSeconds;
                    System.out.print("этаж " + currentFloor);
                    if(it.hasNext())
                        System.out.print(" -> ");
                    previousFloor = currentFloor;
                }
                System.out.println("\n время движения - " + (totalSeconds - waitDoorsInSeconds) + " сек");
            }
}