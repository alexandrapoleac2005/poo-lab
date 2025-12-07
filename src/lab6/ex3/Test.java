package lab6.ex3;
import java.util.*;

public class Test {

    public static void main(String[] args) {

        TablaSah joc = new TablaSah();
        joc.afiseazaTabla();

        Scanner in = new Scanner(System.in);

        while(true){

            if(!in.hasNext()){
                continue;
            }

            if(in.hasNext("exit")) {
                break;
            }

            if(!in.hasNextInt()){
                System.out.println("Eroare");
                in.nextLine();
                continue;
            }

            int coordX = in.nextInt();
            int coordY = in.nextInt();

            PiesaSah piesa = joc.getPiesa(coordX, coordY);
            if(piesa == null){
                System.out.println("Eroare");
                continue;
            }

            if(!in.hasNextInt()){
                System.out.println("Eroare");
                in.nextLine();
                continue;
            }

            int new_coordX = in.nextInt();
            int new_coordY = in.nextInt();

            if(joc.getPiesa(new_coordX, new_coordY) != null){
                System.out.println("Eroare");
                continue;
            }

            piesa.mutaPiesa(new_coordX, new_coordY, joc.getTabla());

            joc.afiseazaTabla();
        }
        in.close();
    }
}
