package two;

public class Whil {
    public static void main(String[] args){
        int n=100;
        double sum=0;
        for(int i=1;i<=n;i++){
            if(i%2==1){
                sum+=1.0/i;
            } else{
                sum-=1.0/i;
            }
        }
        System.out.println(sum);
    }
}
