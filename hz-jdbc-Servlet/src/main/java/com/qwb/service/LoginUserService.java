package com.qwb.service;

import com.qwb.dao.LoginUserDao;
import com.qwb.model.LoginUser;

/**
 * @author created by qwb on 2018/9/22 17:59
 */
public class LoginUserService {
    public static void addUser(LoginUser lu){
        LoginUserDao.addUser(lu);
    }
}
