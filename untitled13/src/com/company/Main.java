import exceptions.AccessDeniedException;
import exceptions.UserNotFoundException;

import java.util.Scanner;

public class Main {
    private static final int MIN_AGE = 18;

    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите логин");
        String login = scanner.nextLine();
        System.out.println("Введите пароль");
        String password = scanner.nextLine();

        User user = getUserByLoginAndPassword(login, password);

        validateUser(user);

        System.out.println("Доступ представлен");
    }

    public static User[] getUsers() {
        User user1 = new User("jhon", "jhon@gmail.com", "pass", 24);
        User user2 = new User( "Ivan", "Ivan@mail.com", "pass", 19);
        User user3 = new User("Anna", "Anna@mail.com", "pass", 17);
        User user4 = new User("Milovidov", "Milovidov@mail.com", "pass", 54);


        return new User[]{user1, user2, user3, user4};
    }

    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
        User[] users = getUsers();
        for (User user : users) {
            if(user.getLogin().equals(login) && user.getPassword().equals(password)){
                return user;
            }
        }
        throw new UserNotFoundException("User " +  login + " with this password not found");

    }

    public static void validateUser(User user) throws AccessDeniedException {
        if(user.getAge() < MIN_AGE)
            throw new AccessDeniedException("User " +  user.getLogin() + " has age " + user.getAge() + " < " + MIN_AGE);
 }
}