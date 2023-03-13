package com.work.example.demo;

import com.work.example.demo.config.StudentConfig;
import com.work.example.demo.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentDemo2 {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(StudentConfig.class);
        Student student = (Student) context.getBean("stu");
        System.out.println(student.toString());
    }
}
