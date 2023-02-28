package com.bjpowernode.javaweb.servlet.ConfigTestServlet;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;


public class ConfigTestServlet extends GenericServlet {
    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        ServletConfig config=this.getServletConfig();
        out.print("ServletConfig对象是："+config);
        String ServletName=config.getServletName();
        String servletName = null;
        out.print("<servlet-name>"+servletName+"</servlet-name>");
        Enumeration<String> initParameterNames=config.getInitParameterNames();
        while(initParameterNames.hasMoreElements()){
            String parameterName=initParameterNames.nextElement();
            String ParameterVal = config.getInitParameter(parameterName);
            String parameterVal=null;
            out.print(parameterName+"="+parameterVal);
            out.print("<br>");
        }
        //String driver=config.getInitParameter("driver");
        //out.print(driver);
        Enumeration<String> names=this.getInitParameterNames();
        while (names.hasMoreElements()){
            String name=names.nextElement();
            String value=this.getInitParameter(name);
            System.out.println(name + "=" + value);
        }
        ServletContext application = config.getServletContext();
        out.print("<br>"+application);
        
        ServletContext application2=this.getServletContext();
        out.print("<br>"+application2);

    }
}
