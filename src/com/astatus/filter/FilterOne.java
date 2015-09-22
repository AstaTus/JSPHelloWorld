package com.astatus.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by AstaTus on 2015/9/22.
 */
public class FilterOne implements Filter {

    public FilterOne(){
        System.out.println("===== FilterOne构造函数 =====");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("===== 开始执行FilterOne：doFilter方法 =====");
        chain.doFilter(req, resp);
        System.out.println("===== 结束执行FilterOne：doFilter方法 =====");
    }

    public void init(FilterConfig config) throws ServletException {
        System.out.println("===== FilterOne初始化方法 =====");
        String initParam = config.getInitParameter("param");
        System.out.println(" param == " + initParam);
    }

    public void destroy() {
        System.out.println("===== FilterOne销毁函数 =====");
    }

}
