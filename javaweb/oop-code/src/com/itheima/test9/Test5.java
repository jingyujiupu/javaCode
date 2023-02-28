package com.itheima.test9;

import java.util.ArrayList;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<ArrayListDemo3> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            ArrayListDemo3 s=new ArrayListDemo3();
            System.out.println("请输入学生的姓名");
            String name=sc.next();
            System.out.println("请输入学生的年龄");
            int age=sc.nextInt();
            s.setName(name);
            s.setAge(age);
            list.add(s);
        }
        for (int i = 0; i < list.size(); i++) {
            ArrayListDemo3 stu=list.get(i);
            System.out.println(stu.getName()+", "+stu.getAge());
        }
    }
}
