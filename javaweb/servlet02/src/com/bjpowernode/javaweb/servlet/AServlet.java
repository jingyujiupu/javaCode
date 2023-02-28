package com.bjpowernode.javaweb.servlet;

import javax.servlet.*;
import java.io.IOException;

public class AServlet implements Servlet {
    //无参数构造方法
    /*public AServlet(){
        System.out.println("AServlet无参数构造方法执行了");
    }*/
    public AServlet(String s){

    }
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("AServlet's init method execute!");


    }



    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("AServlet's service method execute!");
    }


    @Override
    public void destroy() {
        System.out.println("AServlet's destroy method execute!");
    }
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }
    @Override
    public String getServletInfo() {
        return null;
    }

}
