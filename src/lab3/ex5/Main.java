package lab3.ex5;
import java.util.*;
import java.math.*;
public class Main {

    // metoda pentru calcularea factorialului din combinari
    public static BigInteger factorial(int n){
        BigInteger prod =  BigInteger.ONE;
        for(int i = 2; i <= n; i++) {
            prod=prod.multiply(BigInteger.valueOf(i));
        }
        return prod;
    }

    public static BigInteger combinari(int n , int k){
        BigInteger numa = factorial(n);
        BigInteger k_fact = factorial(k);
        BigInteger numi = k_fact.multiply(factorial(n-k));
        BigInteger comb = numa.divide(numi);

        return comb;
    }
    public static void main(String[] args) {

       System.out.println("Subpunctul a) ");
       BigInteger total = combinari(49, 6);
        for (int i = 3; i <= 6; i++) {
           System.out.print("Sansa de castig pentru " + i + " numere castigatoare este: ");
           BigInteger c1 = combinari(6, i);
           BigInteger comb_castigatoare= c1.multiply(combinari(43, 6-i));
           BigDecimal prob = new BigDecimal(comb_castigatoare)
                   .divide(new BigDecimal(total), 20, RoundingMode.HALF_UP);

           System.out.println(prob);

       }

       System.out.println();
       System.out.println("Subpunctul b) ");

       int[] nr_alese ={23, 17, 9, 45, 2, 38};
       int[] nr_extrase = new int[6];
       int nr_castigatoare = 0;
       int cont = 0;

       while(cont < 6){
           int nr_random = (int) (Math.random() * 49) + 1;
           int ok = 0;

           // Verificam daca numarul exista deja
           for(int i = 0; i < cont; i++) {
               if(nr_extrase[i] == nr_random) {
                   ok = 1;
                   break;
               }
           }

           if(ok == 0) {
               nr_extrase[cont]= nr_random;
               cont++;
           }
       }

       System.out.println("Numerele aleatoare sunt: ");
       for(int i = 0; i < 6; i++) System.out.print(nr_extrase[i] + " ");
       System.out.println();

       for(int i = 0; i < 6; i++)
           for(int j = 0 ; j < 6; j++)
           {
               if(nr_alese[i] == nr_extrase[j]) nr_castigatoare++;
           }
       System.out.println("Am ghicit " + nr_castigatoare + " numere");

       System.out.println();
    }
}
