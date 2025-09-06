package jm.task.core.jdbc;


import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();


        userService.saveUser("Иван", "Иванов", (byte) 34);
        userService.saveUser("Мария", "Петрова", (byte) 45);
        userService.saveUser("Ирина", "Александровна", (byte) 45);
        userService.saveUser("Екатерина", "Ринатовна", (byte) 45);

        System.out.println("Список всех пользователей:");
        for (User user : userService.getAllUsers()) {
            System.out.println(user);
        }

        userService.cleanUsersTable();
        System.out.println("Таблица очищена. Текущие пользователи: " + userService.getAllUsers().size());


        userService.dropUsersTable();


        userService.createUsersTable();

        userService.saveUser("Миля", "Руллина", (byte) 25);
        userService.saveUser("Артём", "Иванов", (byte) 28);
        userService.saveUser("Анна", "Смирнова", (byte) 22);
        userService.saveUser("Олег", "Петров", (byte) 30);

        List<User> users = userService.getAllUsers();
        users.forEach(System.out::println);

        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
