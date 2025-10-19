package lab3.ex3;
import java.util.*;

public class Main {
    public static int isVowel(char c){

        c=Character.toLowerCase(c);
        if(c == 'a' || c =='e' || c =='i' || c == 'o' || c == 'u')
            return 1;
        return 0;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        int contVow = 0;
        int contCons = 0;
        int contChar = 0;

        char ch;
        ch= in.next().charAt(0);

        System.out.println("Ex 1: ");
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isLetter(c)) {
                if (isVowel(c) == 1) contVow++;
                else contCons++;
            }
        }

        System.out.println("Vowels: " + contVow + " " + "Consonants: " + contCons);
        System.out.println("Ex 2: ");
        System.out.print("Index: ");

        for(int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            c=Character.toLowerCase(c);
            if(ch == c) System.out.print(i + " ");

        }

    }
}
