package com.astatus.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by AstaTus on 2015/9/22.
 */
public class EncodingFilter implements Filter {

    private String charEncoding = null;
    public void init(FilterConfig config) throws ServletException {
        charEncoding = config.getInitParameter("encoding");
        if (charEncoding == null){
            throw new ServletException("Encoding编码不一致");
        }
    }



    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        if (!charEncoding.equals(req.getCharacterEncoding())){
            req.setCharacterEncoding(charEncoding);
        }

        resp.setCharacterEncoding(charEncoding);

        chain.doFilter(req, resp);
    }

    public void destroy() {
    }

}
