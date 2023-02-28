package com.itheima.test9;

public class ArrayListDemo3 {
    //java bean
    //1.私有化成员变量2.空参构造方法3.带全部参数的构造方法4.get/set方法
    private String name;
    private int age;

    public ArrayListDemo3() {
    }

    public ArrayListDemo3(String name, int age) {
        this.name = name;
        this.age = age;
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

    public String toString() {
        return "ArrayListDemo3{name = " + name + ", age = " + age + "}";
    }
}
