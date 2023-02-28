package Test;

import java.util.Random;
import java.util.Scanner;

public class Test10 {
    public static void main(String[] args){
        //需求：程序自动生成一个1-100间的随机数字，使用程序实现猜出这个数字是多少
        //注意点：生成随机数的代码
        //1.生成一个1-100之间的随机数字
        Random r=new Random();
        int number=r.nextInt(100)+1;
        //2.猜这个数字是多少
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("请输入你要猜的数字");
            int guessNumber=sc.nextInt();
            //3.判断两个数字给出不同的提示
            if(guessNumber>number){
                System.out.println("大了");
            }else if(guessNumber<number){
                System.out.println("小了");
            }else{
                System.out.println("猜中了");
                break;
            }
        }
    }
}
