package Common;

import java.util.Random;
import java.util.Scanner;

public class Test11 {
    public static void main(String[] args){
        //1.得到一个随机数对象，用于得到随机数
       Random r=new Random();
       int data=r.nextInt(10)+1;
        System.out.println(data);
        //2.创建一个Scanner对象，用于接收用户输入的数据
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入年龄");
        int age=sc.nextInt();
        System.out.println(age);
    }
}
