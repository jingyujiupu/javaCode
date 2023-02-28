package com.itheima.arthmeticoperator;

public class Demo10 {
    public static void main(String[] args){
        //1.循环1-5得到里面的每一个数字
        //开始条件：1
        //结束条件：5
        //int sum=0;
        for(int i=1;i<100;i++){
            //拓展小点
            //1.求和的变量不能定义在循环的里面，因为变量只在所属的大括号中有效
            //2.如果我们把变量定义在循环的里面，那么当前变量只能在本次循环中有效
            //当本次循环结束后，变量就会从内存中消失
            //第二次循环的时候，又会重新定义一个新的变量
            int sum=0;
            sum=sum+i;
            System.out.println(sum);
        }

    }
}
