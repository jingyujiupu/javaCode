package com.bjpowernode.javaweb.servlet;
import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class AServlet extends GenericServlet {
    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        ServletContext application = this.getServletContext();
        out.print("ServletContext对象是:"+application);
        Enumeration<String> initParameterNames = application.getInitParameterNames();
        while(initParameterNames.hasMoreElements()){
            String name=initParameterNames.nextElement();
            String value=application.getInitParameter(name);
            out.print(name+"="+value+"<br>");
        }
        String contextPath=application.getContextPath();
        out.print(contextPath+"<br>");

        String realPath=application.getRealPath("/index.html");
        out.print(realPath+"<br>");


        User user=new User("jack","123");
        application.setAttribute("userObj",user);
        Object userObj = application.getAttribute("userObj");
        out.print(userObj+"<br>");
    }
}
