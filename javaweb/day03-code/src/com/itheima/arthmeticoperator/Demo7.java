package com.itheima.arthmeticoperator;
public class Demo7 {
    public static void main(String[] args){
        /*
        一座寺庙里住着三个和尚，已知他们的身高分别为150cm，210cm，165cm
        请用程序实现获取这三个和尚的最高身高
         */
        int height1=150;
        int height2=210;
        int height3=165;
        int temp=height1>height2?height1:height2;
        int max=temp>height3?temp:height3;
        System.out.println(max);
    }

}
