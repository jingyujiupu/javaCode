package com.work.example.demo.config;

import com.work.example.demo.entity.Company;
import com.work.example.demo.entity.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class EmployeeConfig {
    @Bean("emp")
    @Scope("prototype")
    public Employee getEmployeeInstance() {
        Employee employee = new Employee();
        employee.setAge(18);
        employee.setName("Chen");
        employee.setNumber(02);
        Company company = new Company();
        company.setAddress("XiaMeng");
        company.setName("Ping");
        company.setTelephone("123456");
        employee.setCompany(company);
        return employee;
    }
}
