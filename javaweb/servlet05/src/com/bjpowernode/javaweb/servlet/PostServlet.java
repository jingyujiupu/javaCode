package com.bjpowernode.javaweb.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class PostServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        servletResponse.setContentType("text/html");
        PrintWriter out=servletResponse.getWriter();
        out.print("<!DOCTYPE html>");

        out.print("<head>");

        out.print("<title>from post servlet</title> ");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>from post servlet</h1>");
        out.print("</body>");
        out.print("</html>");
    }
}
