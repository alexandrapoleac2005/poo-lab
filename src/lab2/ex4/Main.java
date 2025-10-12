package lab2.ex4;

public class Main {
    public static void main(String[] args) {

        // impartirea unui intreg la 0
       int a = 10, b = 0;
       try{
           System.out.println("a / b = " + a / b);
       }
       catch(ArithmeticException e){
           System.out.println(e);
       }

       System.out.println();

       System.out.println("Cazurile impartirii unui numar flotant pozitiv / negativ la 0 :");
       // impartirea unui numar pozitiv in virgula flotanta la 0.0
        float a2 = 10.0f, b2 = 0.0f;
        System.out.println("a2 / b2 = " + a2 / b2);

       // impartirea unui numar negativ in virgula flotanta la 0.0
        float a2_neg = -10.0f, b2_neg = 0.0f;
        System.out.println("a2_neg / b2_neg = " + a2_neg / b2_neg);

        System.out.println();

        System.out.println("Operatia de scadere dintre infinit si infinit:");
        double inf1 = Double.POSITIVE_INFINITY;
        double inf2 = Double.POSITIVE_INFINITY;
        double rez = inf1 - inf2;
        System.out.println("inf1 - inf2 = " + rez);

        System.out.println();

        System.out.println("Operatia de inmultire dintre infinit si minus infinit:");
        double inf3 = Double.NEGATIVE_INFINITY;;
        double rez2 = inf1 * inf3;
        System.out.println("inf1 * inf3 = " + rez2);

        System.out.println();

        System.out.println("Asignarea unei valori booleene, un intreg (prin conversie):");
        int x = 10;
        boolean bool = (x>0);
        System.out.println("x > 0 ? " + bool);

        System.out.println();

        System.out.println("Asignarea unei valori intregi, un numar in virgula flotanta (prin conversie):");
        double doub = 5.74;
        int y = (int)doub;
        System.out.println("y = " + y);

    }
}
