package two;
public class Mathi {
    public static boolean isPrime(int a) {
        if (a % 2 == 0 || a <= 1) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args) {
        int n=100;
        int cnt=0;
        for(int i=1;i<=n;i++){
            if(isPrime(i)){
                cnt++;
                System.out.print(i+" ");
            }
        }
        System.out.println("1-"+n+"素数有"+cnt+"个");
    }
}


