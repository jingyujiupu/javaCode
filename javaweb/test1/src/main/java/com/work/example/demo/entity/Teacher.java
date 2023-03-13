package com.work.example.demo.entity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component("teacher")
@Scope("prototype")
public class Teacher {
    @Value("Chen")
    private String name;
    @Value("123456")
    private String number;
    @Value("male")
    private String gender;


    public Teacher() {
    }

    public Teacher(String name, String number, String gender) {
        this.name = name;
        this.number = number;
        this.gender = gender;
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
     * @return number
     */
    public String getNumber() {
        return number;
    }

    /**
     * 设置
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * 获取
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String toString() {
        return "Teacher{name = " + name + ", number = " + number + ", gender = " + gender + "}";
    }
}
