package com.work.example.demo.config;
import com.work.example.demo.entity.Teacher;
import com.work.example.demo.entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Configuration
public class StudentConfig {

    @Bean("stu")
    @Scope("prototype")
    public Student getStudentInstance(){
        Student student=new Student();
        student.setGender("male");
        student.setName("Jing");
        student.setName("123456");
        Teacher teacher=new Teacher();
        teacher.setGender("female");
        teacher.setName("keli");
        teacher.setNumber("1234567");
        return student;
    }
}
