package lab4.ex2;

import java.awt.*;

public class Main{
    public static void main(String[] args) {
        /*Autovehicul a1 = new Autovehicul("Dacia", Color.RED, 300, 5);
        a1.accelerare(130);
        a1.accelerare(200);
        a1.decelerare(150);
        a1.decelerare(200);
        a1.accelerare(30);
        a1.schimbaViteza(2, true);
        a1.schimbaViteza(1, false);
        System.out.println();

        String text = a1.toString();
        System.out.println(text);

        a1.oprire();*/

        Autovehicul a2 = new Autovehicul();
        TestDrive.test(a2);

        System.out.println(a2.info("Mercedes"));
        System.out.println(a2.info("Audi", Color.RED));


    }
}