package com.work.example.demo.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
//注解注入
@Component("company")
@Scope("prototype")
public class Company {
    @Value("Jing")
    private String name;
    @Value("zhengzhou")
    private String address;
    @Value("19513871662")
    private String telephone;

    public Company() {
    }

    public Company(String name, String address, String telephone) {
        this.name = name;
        this.address = address;
        this.telephone = telephone;
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
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取
     * @return telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * 设置
     * @param telephone
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String toString() {
        return "Company{name = " + name + ", address = " + address + ", telephone = " + telephone + "}";
    }
}
