package com.work.example.demo.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
//注解注入
@Component("employee")
@Scope("prototype")
public class Employee {
    @Value("2")
    private int number;
    @Value("冯")
    private String name;
    @Value("22")
    private int age;
    @Autowired(required = false)
    @Qualifier("company")
    private Company company;

    public Employee() {
    }

    public Employee(int number, String name, int age, Company company) {
        this.number = number;
        this.name = name;
        this.age = age;
        this.company = company;
    }

    /**
     * 获取
     * @return number
     */
    public int getNumber() {
        return number;
    }

    /**
     * 设置
     * @param number
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return company
     */
    public Company getCompany() {
        return company;
    }

    /**
     * 设置
     * @param company
     */
    public void setCompany(Company company) {
        this.company = company;
    }

    public String toString() {
        return "Employee{number = " + number + ", name = " + name + ", age = " + age + ", company = " + company + "}";
    }
}
