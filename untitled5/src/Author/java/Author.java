package Author.java;

import java.time.LocalDate;

public class Author {


    public String surname;
    String name;
    LocalDate birthday;
    String country;

    public Author(String name, String surname, LocalDate birthday, String country) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.country = country;
    }

    public String toString() {
        return  name + " " + surname + "," + " дата рождения: " + birthday + "," + " страна: "  + country;
    }
}