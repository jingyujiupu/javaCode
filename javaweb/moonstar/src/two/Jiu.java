package two;

public class Jiu {
    public static void main(String[] args){
        int n=100;
        int as=0;
        for(int i=1;i<=n;i++){
            if(i%10==9){
                as++;
            }
            if(i/10==9){
                as++;
            }
        }
        System.out.println(as);
    }
}
