package two;

public class Blog {
    public static int add(int a,int b){
        return a+b;
    }
    public static double add(double a,double b){
        return a+b;
    }
    public static long add(long a,long b){
        return a+b;
    }
    public static void main(String[] args){
        System.out.println(add(2,6));
        System.out.println(add(2.4,5.6));
        System.out.println(add(850375L,4892685L));
    }
}
