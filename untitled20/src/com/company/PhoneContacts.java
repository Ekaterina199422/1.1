package com.company;

import javafx.beans.binding.MapExpression;
import java.util.*;

public class PhoneContacts {
    private Map<String, List<Contact>> groups = new HashMap<>();

    public void addGroup(String contactGroup) {

        this.groups.put(contactGroup, new ArrayList<>());
    }

    public void addContactToGroup(String contactGroup, Contact contact) {
        if (!this.groups.containsKey(contactGroup)) {
            this.addGroup(contactGroup);
        }

        List<Contact> groupContacts = this.groups.get(contactGroup);
        groupContacts.add(contact);
    }

    public void showInfo() {

        for (String s : groups.keySet()) {
            System.out.println("-" + s + ": ");

            for (Contact contact : groups.get(s)) {
                System.out.println(contact.toString());
            }
        }
    }
}

