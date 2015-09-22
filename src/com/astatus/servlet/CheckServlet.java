package com.astatus.servlet;

import com.astatus.entity.User;
import com.astatus.service.CheckUserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class CheckServlet extends HttpServlet {
    private CheckUserService checkService = new CheckUserService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String uname = request.getParameter("uname");
        String passwd = request.getParameter("upwd");

        RequestDispatcher rd = null;
        String forward = null;

        if (uname == null || passwd == null){
            request.setAttribute("msg", "用户名或者密码为空！");
            rd = request.getRequestDispatcher("/15/error.jsp");
            rd.forward(request, response);
        }else{
            User user = new User();
            user.setName(uname);
            user.setPassword(passwd);

            boolean pass = checkService.check(user);
            if (pass){
                forward = "/15/success.jsp";
            }else{
                request.setAttribute("msg", "用户名或者密码错误！");
                forward = "/15/error.jsp";
            }

            rd = request.getRequestDispatcher(forward);
            rd.forward(request, response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);

    }
}
