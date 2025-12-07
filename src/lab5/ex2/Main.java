package lab5.ex2;

public class Main {
    public static void main(String[] args) {

        Matrice A = new Matrice(2, 2);
        Matrice B = new Matrice(2, 2);

        A.set(0, 0, new Complex(1, 2));
        A.set(0, 1, new Complex(3, -1));
        A.set(1, 0, new Complex(0, 4));
        A.set(1, 1, new Complex(2, 0));

        B.set(0, 0, new Complex(2, 1));
        B.set(0, 1, new Complex(1, 3));
        B.set(1, 0, new Complex(4, -2));
        B.set(1, 1, new Complex(0, 1));

        A.afisare();


    }
}
