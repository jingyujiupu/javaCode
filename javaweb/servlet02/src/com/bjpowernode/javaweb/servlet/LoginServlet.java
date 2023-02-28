package com.bjpowernode.javaweb.servlet;

import javax.servlet.*;
import java.io.IOException;

public class LoginServlet extends GenericServlet{
    public void init(ServletConfig config) throws ServletException{
        System.out.println("重写我自己的规则");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("正在处理用户登录请求，请稍后。。。。");
        ServletConfig config=this.getServletConfig();
        System.out.println("service方法中是否可以获取到ServletConfig对象？"+config);
    }
}
