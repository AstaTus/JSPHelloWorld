package com.astatus.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by AstaTus on 2015/9/22.
 */
public class FilterTow implements Filter {
    public FilterTow(){
        System.out.println("===== FilterTwo构造函数 =====");
    }

    public void destroy() {
        System.out.println("===== FilterTwo销毁函数 =====");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("===== 开始执行FilterTwo：doFilter方法 =====");
        chain.doFilter(req, resp);
        System.out.println("===== 结束执行FilterTwo：doFilter方法 =====");
    }

    public void init(FilterConfig config) throws ServletException {

        System.out.println("===== FilterTow初始化方法 =====");
    }

}
