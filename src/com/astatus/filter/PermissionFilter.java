package com.astatus.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by AstaTus on 2015/9/22.
 */
public class PermissionFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {

    }



    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        HttpServletRequest request = (HttpServletRequest)req;
        HttpServletResponse response = (HttpServletResponse)resp;

        String servletPath = request.getServletPath();
        HttpSession session = request.getSession();
        String flag = (String)session.getAttribute("flag");

        if (servletPath != null && (servletPath.equals("/17/login.jsp") ||
                servletPath.equals("/17/index.jsp") || servletPath.equals("/LoginServlet17"))){
            chain.doFilter(req, resp);
        }else{
            if (flag != null && flag.equals("login_success")){
                chain.doFilter(req, resp);
            }else if (flag != null && flag.equals("login_error")){
                req.setAttribute("msg", "登录失败请重新登录");
                req.setAttribute("return_uri", servletPath);
                RequestDispatcher rd = req.getRequestDispatcher("/17/login.jsp");
                rd.forward(req, resp);
            }else{
                req.setAttribute("msg", "尚未登录！");
                req.setAttribute("return_uri", servletPath);
                RequestDispatcher rd = req.getRequestDispatcher("/17/login.jsp");
                rd.forward(req, resp);
            }
        }


    }

    public void destroy() {
    }


}
