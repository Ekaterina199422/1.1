package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class MissedCalls {
    private Map<LocalDateTime, String> missedCalls = new TreeMap<>();

    public MissedCalls() {}

    //  TODO: добавление пропущенного
    public void addMissedCall(String phone) {
        LocalDateTime localDateTime;
        localDateTime = LocalDateTime.now();
        missedCalls.put(localDateTime, phone);
    }

    //  TODO: вывод пропущенных
    public void getAllMissedCalled(Map<String, Contact> mapContacts) {
        for (LocalDateTime value : missedCalls.keySet()) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy, hh:mm:ss");
            ;
            if (mapContacts.containsKey(missedCalls.get(value))) {

                System.out.println(value.format(formatter) + ", " + missedCalls.get(value) + ", " + mapContacts.get(missedCalls.get(value)).getSurname() + ", " + mapContacts.get(missedCalls.get(value)).getName());
            } else {
                System.out.println(value.format(formatter) + " " + missedCalls.get(value));
            }
        }
    }
    //  TODO: очистка
    public void clear() {
        missedCalls.clear();
    }
}