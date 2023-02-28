package Method;

public class Demo5 {
    //定义一个方法判断数组中的某一个数是否存在，将结果返回给调用处
    //return，break关键字的区别
    //return：其实跟循环没有什么关系，跟方法有关，表示1结束方法，2返回结果
    //如果方法执行到了return，那么整个方法全部结束，里面的循环也会随之结束
    //break:其实跟方法没有什么关系的，结束循环或者switch的
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
        boolean flag=contains(arr,5);
        System.out.println(flag);
    }
    public static boolean contains(int[] arr,int number){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==number){
                return true;
            }
        }
        return false;
    }
}
