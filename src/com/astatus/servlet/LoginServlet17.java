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
@WebServlet(name = "LoginServlet17")
public class LoginServlet17 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uname = request.getParameter("uname");
        String passwd = request.getParameter("upwd");

        String returnUri = request.getParameter("return_uri");

        System.out.println("用户名 ==》" + uname);
        System.out.println("密码 ==》" + passwd);
        System.out.println("return_uri" + returnUri);

        RequestDispatcher rd = null;
        if (uname == null || passwd == null){
            request.setAttribute("msg", "用户名或者密码为空！");
            rd = request.getRequestDispatcher("17/login.jsp");
            rd.forward(request, response);
        }else{
            if (uname.equals("极客学院") && passwd.equals("123456")){
                request.getSession().setAttribute("flag", "login_success");
                if (returnUri != null){
                    rd = request.getRequestDispatcher(returnUri);
                    rd.forward(request, response);
                }else{
                    rd = request.getRequestDispatcher("/17/index.jsp");
                    rd.forward(request, response);
                }

            }else{
                request.getSession().setAttribute("flag", "login_error");
                request.setAttribute("msg", "用户名输入错误");
                rd = request.getRequestDispatcher("/17/login.jsp");
                rd.forward(request, response);
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
