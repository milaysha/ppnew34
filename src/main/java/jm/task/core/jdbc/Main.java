package jm.task.core.jdbc;


import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

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
    }
}
