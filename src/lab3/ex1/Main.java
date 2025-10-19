package lab3.ex1;
import java.util.*;

public class Main {
    public static int isPrime(int n){
        if(n == 0 || n == 1) return 0;
        if(n == 2) return 1;
        for(int i = 2;  i <= n / 2; i++){
            if(n % i == 0) return 0;
        }
        return 1;
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        for(int i = n; i <= m; i++) {

            if(i%2==0) {
                int ok = 0;
                for (int j = 2; j <= i / 2; j++) {
                    int diferenta = i - j;
                    if (isPrime(diferenta) == 1 && isPrime(j) == 1) {
                       System.out.println(i + " = " + diferenta + " + " + j);
                        ok = 1;
                        break;
                    }
                }
            }
        }




    }
}
