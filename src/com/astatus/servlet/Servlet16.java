package com.astatus.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by AstaTus on 2015/9/22.
 */
public class Servlet16 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("=====POST方法=====");

        String userName = request.getParameter("uname");
        String password = request.getParameter("upwd");

        System.out.println("用户名==>>" + userName);
        System.out.println("密码==>>" + password);

        String forward = null;
        if (userName.equals("极客学院") && password.equals("111")){
            //请求转发
            forward = "/16/success.jsp";
            RequestDispatcher rd = request.getRequestDispatcher(forward);
            rd.forward(request, response);
            //请求重定向
            //resp.sendRedirect(req.getContextPath() + "/14/success.jsp");
        }else{
            //请求转发
            forward = "/16/error.jsp";
            RequestDispatcher rd = request.getRequestDispatcher(forward);
            rd.forward(request, response);
            //请求重定向
            //resp.sendRedirect(req.getContextPath() + "/14/error.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
