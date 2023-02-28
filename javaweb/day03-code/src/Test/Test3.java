package Test;

public class Test3 {
    public static void main(String[] args){
        int a=100;
        int b=37;
        int count=0;
        while(a>=b){
            a=a-b;
            count++;
        }
        System.out.println("余数为"+a);
        System.out.println("商为"+count);
    }
}
