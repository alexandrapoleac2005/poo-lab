package lab4.ex4;

public class Main {
    public static void main(String[] args) {

        Produs prod = new Produs("Fanta", 7,30, 100);
        Magazin m1 = new Magazin("Auchan", prod);
        m1.vindeProdus(13);
        System.out.println();
        m1.vindeProdus(18);
        System.out.println();
        m1.aprovizioneazaProdus(27);
        System.out.println();
        m1.totalProdus();
    }
}
