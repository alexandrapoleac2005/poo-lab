package lab10.ex4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        FacebookAccount contPrincipal = new FacebookAccount("Ionel", 29, "Cluj");

        FacebookAccount prieten1 = new FacebookAccount("George", 27, "Brasov");
        FacebookAccount prieten2 = new FacebookAccount("Miruna", 23, "Cluj");
        FacebookAccount prieten3 = new FacebookAccount("Ioana", 25, "Cluj");
        FacebookAccount prieten4 = new FacebookAccount("Daniel", 20, "Bucuresti");

        contPrincipal.adaugaPrieten(prieten1);
        contPrincipal.adaugaPrieten(prieten2);
        contPrincipal.adaugaPrieten(prieten3);
        contPrincipal.adaugaPrieten(prieten4);

        contPrincipal.afisarePrieten();
        System.out.println();

        contPrincipal.stergerePrieten(prieten3);

        contPrincipal.afisarePrieten();
    }
}
