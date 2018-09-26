package com.jdbc;

import java.sql.*;

/**
 * @author created by qwb on 2018/9/18 10:17
 */
public class TestJdbc {
    public static void main(String[] args) {
        //1 注册驱动
        Connection con = null;
        Statement statement = null;
        ResultSet res = null;

        try {
//            Driver driver = new com.mysql.jdbc.Driver();
//            DriverManager.registerDriver(driver);
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/test?serverTimezone=GMT%2B8&useSSL=false";
            String user = "root";
            String password = "123456";
            try {
                Class.forName(driver);
                con =  DriverManager.getConnection(url,user,password);
                String sql = "select * from user";
                statement = con.createStatement();
                res = statement.executeQuery(sql);
                while(res.next()){

                    String name = res.getString("name");
                    String address = res.getString("address");
                    System.out.println(name + " " +": "+address);
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(res!=null){
                try {
                    res.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
