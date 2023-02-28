package com.bjpowernode.javaweb.servlet;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class BServlet extends GenericServlet {
    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        ServletContext application = this.getServletContext();
        out.print("ServletContext对象是:"+application);
        application.log("我是");
    }
}
