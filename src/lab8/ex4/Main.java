package lab8.ex4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Persoana> persoane = new ArrayList<>();
        persoane.add(new Persoana("Popescu", "Andrei", 20));
        persoane.add(new Persoana("Grigore", "Alex", 39));
        persoane.add(new Persoana("Avram", "Ioana", 22));

        Collections.sort(persoane);
        // METODA 1
      /*  for(int i = 0; i < persoane.size(); i++) {
            System.out.println(persoane.get(i));
        }
      */

        // METODA 2
        for (Persoana p : persoane){
            System.out.println(p);
        }
    }
}
