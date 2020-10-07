package com.company;

import java.util.HashMap;
import java.util.Map;

public class PhoneContacts {
    private Map<String, Contact> contacts = new HashMap<>();

    public Map<String, Contact> getContacts() {
        return contacts;
    }


    public boolean checkContacts(String phone) {
        return contacts.containsKey(phone);
    }

    //  TODO: добавление контакта
    public void addContact(String phone, Contact contact) {

            contacts.put(phone, contact);

    }

    public Contact getContactByPhone(String phone) {
        return contacts.get(phone);
    }
    public Contact getValueContacts(String key) {
        return contacts.get(key);
    }
}
