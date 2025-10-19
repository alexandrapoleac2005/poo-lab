package lab3.ex4;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Concatenare: ");
        Scanner in = new Scanner(System.in);
        String text1 = in.nextLine();
        String text2 = in.nextLine();

        System.out.println(text1 + " " + text2);
        System.out.println(text1 + text2);

        System.out.println();
        System.out.println("Egalitate referinte: ");
        System.out.println(text1==text2);
        String a = "test1";
        String b = "test1";
        System.out.println(a==b);

        System.out.println();
        System.out.println("Egalitate continut: ");
        System.out.println(text1.equals(text2));
        System.out.println(a.equals(b));


    }
}
