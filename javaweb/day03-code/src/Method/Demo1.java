package Method;

public class Demo1 {
    public static void main(String[] args){
        //直接调用
        getSum(10,20,30);//无输出，有返回值了已经
        //赋值调用
        int sum=getSum(10,20,30);
        System.out.println(sum);
        //输出调用
        System.out.println(getSum(10,20,30));

    }
    public static int getSum(int num1,int num2,int num3){
        int result=num1+num2+num3;
        return result;
    }
}
