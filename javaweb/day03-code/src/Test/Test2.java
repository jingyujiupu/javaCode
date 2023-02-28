package Test;

public class Test2 {
    public static void main(String[] args){
        /*
        需求：世界最高山峰时珠穆朗玛峰（8844.43米=8844430毫米），假如我有
        一张足够大的纸，它的厚度时0.1mm。请问：
        我折叠多少次，可以折成珠穆朗玛峰的高度
         */
        double height=8844430;
        double paper=0.1;
        int count=0;
        //选择while理由：此时我们不知道循环次数也不知道循环的范围，只知道循环的结束条件，所以用while
        while(paper<height){
            paper=paper*2;
            count++;
        }
        System.out.println(count);
    }
}
