package com.work.example.demo;

import com.work.example.demo.config.EmployeeConfig;
import com.work.example.demo.entity.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestDemo2 {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(EmployeeConfig.class);
        Employee employee=(Employee)context.getBean("emp");
        System.out.println(employee.toString());
    }
}
