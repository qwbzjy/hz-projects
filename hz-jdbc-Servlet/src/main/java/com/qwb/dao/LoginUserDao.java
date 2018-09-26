package com.qwb.dao;

import com.qwb.model.LoginUser;
import com.qwb.util.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author created by qwb on 2018/9/22 17:55
 */
public class LoginUserDao {
    public static void addUser(LoginUser lu){
        Connection conn = DBUtils.getConnection();
        String sql = "" + "insert into users" + "(username,password)"
                        + "values(" +"?,?)";
        try {
            PreparedStatement ptmt = conn.prepareStatement(sql);
            ptmt.setString(1,lu.getName());
            ptmt.setString(2,lu.getPassword());
            ptmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
