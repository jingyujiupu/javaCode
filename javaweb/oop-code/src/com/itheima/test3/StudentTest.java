package com.itheima.test3;

public class StudentTest {
    public static void main(String[] args) {
        //创建对象，调用空参构造
        Student s=new Student("zhangsan",23);
        System.out.println(s.getAge());
        System.out.println(s.getName());
    }
}
