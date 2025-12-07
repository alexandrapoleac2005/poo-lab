package PARTIAL_lab7;
import java.util.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int capacitateMaxima = 0;

        try{
            capacitateMaxima = in.nextInt();
            if(capacitateMaxima <= 0) System.out.println("Introduceti un numar valid");
            capacitateMaxima = 15;
        }
        catch(Exception e){
            System.out.println("Caracterele sunt invalide");
            capacitateMaxima = 15;
        }


        Gradina gradina = new Gradina(capacitateMaxima);
        Copac cop1 = new Copac(128.3, true, "Brad", 36, 130);
        Cactus cact1 = new Cactus(12.2, false, "Cactus de casa", 2, 30);
        Floare flo1 = new Floare(Color.RED, 13, "Trandafir", 1, 27);

        gradina.adaugaInGradina(cop1);
        gradina.adaugaInGradina(cact1);
        gradina.adaugaInGradina(flo1);

        // PENTRU POLIMORFISM
        /*System.out.println("Polimorfism ");
        Planta planta1 = new Cactus(12.3, true, "Cactus mic", 2, 13.2);
        System.out.println(planta1.descriere());
        Planta planta2 = new Planta("Planta necunoscuta", 13, 12.1);
        System.out.println(planta2.descriere());*/

        cop1.creste();
        System.out.println(cop1.descriere());

        cact1.stocheazaApa();
        System.out.println(cact1.descriere());

        flo1.infloreste();
        System.out.println(flo1.descriere());

        gradina.elimina();

    }
}
