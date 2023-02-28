package Common;

import java.util.Scanner;

public class Test7 {
    public static int[] func2(int number){
        //需求：把整数上的每一位都添加到数组当中。反向推导
        //1.计算出数组的长度
        //定义一个变量临时记录number的值，就是为了第三步的时候再次使用
        int temp=number;
        //定义一个变量进行统计
        int count=0;
        while(number!=0){
            //每一次循环就去掉右边的一个数字
            number=number/10;
            count++;
        }
        //2.定义数组，动态初始化
        int[] arr=new int[count];
        //3.把整数上的每一位都添加到数组上
        int index=arr.length-1;
        while(temp!=0){
             int ge=temp%10;
             temp=temp/10;
             arr[index]=ge;
             index--;
        }
        return arr;
    }
}
