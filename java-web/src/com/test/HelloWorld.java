package com.test;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author created by qwb on 2018/9/22 15:36
 */
public class HelloWorld extends HttpServlet {

    private String message;

    @Override
    public void init() {
        message = "Hello World, this message is from servlet!";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException,IOException{
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h3>"+message + "</h3>");
    }


    public void destory(){
        super.destroy();
    }
}
