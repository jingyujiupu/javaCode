package com.bjpowernode.javaweb.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class GetServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        ServletResponse response = null;
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.print("<!DOCTYPE html>");

        out.print("<head>");

        out.print("<title>from get servlet</title> ");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>from get servlet</h1>");
        out.print("</body>");
        out.print("</html>");



    }
}
