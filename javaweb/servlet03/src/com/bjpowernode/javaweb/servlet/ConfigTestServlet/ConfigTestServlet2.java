package com.bjpowernode.javaweb.servlet.ConfigTestServlet;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class ConfigTestServlet2 extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        ServletResponse response = null;
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        ServletConfig config=this.getServletConfig();
        out.print("ServletConfig对象："+config);
        String value = config.getInitParameter("key");
        out.print("<br>"+value);
    }
}
