package lab8.ex4;

import java.util.Arrays;

public class Main {
    public static void afisare(Persoana[] persoane) {
        for(int i = 0; i < persoane.length; i++){
            System.out.println(persoane[i].toString());
        }
    }
    public static void main(String[] args) {

        Persoana[] persoane = new Persoana[3];
        persoane[0] = new Persoana("Popescu", "Ion", 35);
        persoane[1] = new Persoana("Ilea", "Alina", 27);
        persoane[2] = new Persoana("Grigore", "Maria", 48);

        afisare(persoane);
        Arrays.sort(persoane);
        System.out.println();
        afisare(persoane);
    }
}
