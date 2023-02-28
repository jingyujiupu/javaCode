package Array;

public class Array1 {
    public static void main(String[] args){
        //静态初始化
        //简化格式：[]数组名={元素1，元素2...};
        //需求1： 定义数组存储5个学生的年龄
        int[] arr1=new int[]{11,12,13,14,15};
        int[] arr2={11,12,13,14};
        //需求2：定义数组存储3个学生的姓名
        String[] arr3=new String[]{"zhangsan","lisi","wangwu1"};
        String[] arr4={"zhangsan","lisi","wangwu"};
        //需求3：定义数组存储4个学生的身高
        double[] arr5=new double[]{1.93,1.75,1.73,1.81};
        double[] arr6={1.93,1.75,1.73,1.81};
        System.out.println(arr6);//[D@7c30a502
        //解释一下当前地址值的格式含义
        //[:表示当前是一个数组
        //D：表示当前的数组里面的元素都是double类型的
        //@：表示一个间隔符号（固定格式）
        //7c30a502:才是这个数组真正的地址值（十六进制）
        //平时我们习惯性的把这个整体叫做数组的地址值
    }
}
