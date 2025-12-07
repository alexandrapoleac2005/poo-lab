package lab6.ex2;

import java.util.List;
import java.util.ArrayList;

public class Ghiozdan {

    private List<Rechizita> listaRechizite;

    public Ghiozdan(){
        this.listaRechizite = new ArrayList<>();
    }

    public void addCaiet(Caiet caiet){
        this.listaRechizite.add(caiet);
        System.out.println("Am adaugat caietul: " + caiet.toString());
    }

    public void addManual(Manual manual){
        this.listaRechizite.add(manual);
        System.out.println("Am adaugat manualul: " + manual.toString());
    }

    public void listItems(){
        for(Rechizita rechizita : listaRechizite){
            System.out.println(rechizita.toString());
        }
    }

    public void listManual(){
        for(Rechizita rechizita : listaRechizite){
            if(rechizita instanceof Manual)
                System.out.println(rechizita.toString());
        }
    }

    public void listCaiet(){
        for(Rechizita rechizita : listaRechizite){
            if(rechizita instanceof Caiet){
                System.out.println(rechizita.toString());
            }
        }
    }

    public int getNrRechizite(){
       return listaRechizite.size();
    }

    public int getNrManuale(){
        int nrManuale = 0;
        for(Rechizita rechizite : listaRechizite){
            if(rechizite instanceof Manual)
                nrManuale++;
        }
        return nrManuale;
    }

    public int getNrCaiet(){
        int nrCaiet = 0;
        for(Rechizita rechizite : listaRechizite){
            if(rechizite instanceof Caiet)
                nrCaiet++;
        }
        return nrCaiet;
    }


}
