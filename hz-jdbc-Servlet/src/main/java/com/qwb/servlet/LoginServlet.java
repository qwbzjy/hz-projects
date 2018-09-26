package com.qwb.servlet;


import com.qwb.model.LoginUser;
import com.qwb.service.LoginUserService;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;

/**
 * @author created by qwb on 2018/9/22 18:00
 */
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException,IOException{
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException,IOException{
        req.setCharacterEncoding("utf-8");
        LoginUser lu = new LoginUser();
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println(username);
        System.out.println(password);
        lu.setName(username);
        lu.setPassword(password);
        LoginUserService.addUser(lu);
        resp.setContentType("text/html;charset=UTF-8");
        //为名字和姓式创建cookie
        Cookie name = new Cookie("name",req.getParameter("username"));
//        Cookie url = new Cookie("url",req.getParameter("url"));
        Cookie pwd = new Cookie("pwd",req.getParameter("password"));
        name.setMaxAge(60*60*24);
//        url.setMaxAge(60*60*24);
        resp.addCookie(name);
//        resp.addCookie(url);
        resp.addCookie(pwd);
        resp.getWriter().println("添加成功");
    }
}
