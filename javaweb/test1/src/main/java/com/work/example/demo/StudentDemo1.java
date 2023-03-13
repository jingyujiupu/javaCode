package com.work.example.demo;
import com.work.example.demo.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class StudentDemo1 {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student=(Student)context.getBean("student");
        System.out.println(student.toString());
    }
}
