package com.qwb.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author created by qwb on 2018/9/22 17:52
 */
public class DBUtils {
    private static final String URL = "jdbc:mysql://localhost:3306/servlet?serverTimezone=GMT%2B8&useSSL=false";
    private static final String USER = "root";
    private static final String PASSWORD = "123456";

    private static Connection conn = null;
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return conn;
    }

}
