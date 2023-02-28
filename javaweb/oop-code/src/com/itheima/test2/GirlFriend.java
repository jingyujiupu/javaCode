package com.itheima.test2;

public class GirlFriend {
    //属性
   private int age;
   private String gender;
   private String name;
   /*
   针对于每一个私有化的成员变量，都要提供get和
   set方法
   set方法：给成员变量赋值
   get方法：对外提供成员变量的值
    */
    public void setName(String a){
        name=a;
    }
    public String getName(){
        return name;
    }
    public void setAge(int b){
        if(age>=18&&age<=50){
            age=b;
        }else{
            System.out.println("无效");
        }

    }
    public int getAge(){
        return age;
    }
    public void setGender(String c){
        gender=c;
    }
    public String getGender(){
        return gender;
    }
}
