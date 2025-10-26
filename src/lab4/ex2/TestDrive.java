package lab4.ex2;
import java.awt.*;

public class TestDrive {

    static double kmParcursi = 0;


    public static void test(Autovehicul a){
        double timpOre = 0.5;

        a.accelerare(55);
        System.out.println(a.toString());
        kmParcursi += timpOre * a.getViteza();

        a.schimbaViteza(2, true);
        System.out.println(a.toString());

        a.accelerare(80);
        System.out.println(a.toString());
        kmParcursi += timpOre * a.getViteza();

        a.schimbaViteza(1, true);
        System.out.println(a.toString());

        a.decelerare(20);
        System.out.println(a.toString());
        kmParcursi += timpOre * a.getViteza();

        a.schimbaViteza(2, false);
        System.out.println(a.toString());

        a.oprire();
        System.out.println(a.toString());

        System.out.println("Km parcursi in total: " +  kmParcursi);

    }
}
