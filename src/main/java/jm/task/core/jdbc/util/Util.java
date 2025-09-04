package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/new_schema1";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "mila_228";
    private static Connection connection;
    public static Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName(DB_DRIVER); // загружаем драйвер
                connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
                System.out.println("✅ Подключение установлено!");
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        } return connection;

    }

}
