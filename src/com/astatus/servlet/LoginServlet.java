package com.astatus.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by AstaTus on 2015/9/21.
 */
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("=====GET方法=====");
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("=====POST方法=====");

        String userName = req.getParameter("uname");
        String password = req.getParameter("upwd");

        System.out.println("用户名==>>" + userName);
        System.out.println("密码==>>" + password);

        String forward = null;
        if (userName.equals("111") && password.equals("111")){
            //请求转发
            forward = "/14/success.jsp";
            RequestDispatcher rd = req.getRequestDispatcher(forward);
            rd.forward(req, resp);
            //请求重定向
            //resp.sendRedirect(req.getContextPath() + "/14/success.jsp");
        }else{
            //请求转发
            forward = "/14/error.jsp";
            RequestDispatcher rd = req.getRequestDispatcher(forward);
            rd.forward(req, resp);
            //请求重定向
            //resp.sendRedirect(req.getContextPath() + "/14/error.jsp");
        }

    }

   /* @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("uname");
        String password = req.getParameter("upwd");

        System.out.println("用户名==>>" + userName);
        System.out.println("密码==>>" + password);
    }*/
}
