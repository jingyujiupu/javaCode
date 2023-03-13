package com.work.example.demo;

import com.work.example.demo.entity.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo1 {
    public static void main(String[] args) {
        //1.获取Bean
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.获取Employee
        Employee employee = (Employee) context.getBean("employee");
        System.out.println(employee.toString());
    }
}
