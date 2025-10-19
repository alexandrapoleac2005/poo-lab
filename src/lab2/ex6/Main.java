package lab2.ex6;
import java.util.Scanner;
import java.math.*;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        BigInteger suma = BigInteger.ZERO;
        BigInteger doi = BigInteger.valueOf(2);

        for(int i=0;i<n;i++){
           BigInteger calculPartial = doi.pow(i);
           suma = suma.add(calculPartial);
        }

        System.out.println(suma);

    }
}
