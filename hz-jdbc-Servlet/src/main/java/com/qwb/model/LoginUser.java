package com.qwb.model;

/**
 * @author created by qwb on 2018/9/22 17:50
 */
public class LoginUser {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String name;

    private String password;
}
