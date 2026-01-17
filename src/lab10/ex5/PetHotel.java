package lab10.ex5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PetHotel{

    private String numeHotel;
    private String oras;
    private List<Caine> listaCaini;
    private int nrMaximCaini;

    public PetHotel(String numeHotel, String oras){
        this.numeHotel = numeHotel;
        this.oras = oras;
        this.listaCaini = new ArrayList<>();
        this.nrMaximCaini = 5;
    }

    public void inregistrareCamera(Caine caine){
        if(this.nrMaximCaini > 5) System.out.println("Hotelul este ocupat!");
        else listaCaini.add(caine);
    }

    public void eliberareCamera(Caine caine){
        if(listaCaini.contains(caine)) listaCaini.remove(caine);
        else System.out.println(caine.getNume() + " nu este cazat la noi!");
    }

    public void listaCazare(){
        if(listaCaini.isEmpty()) System.out.println("Niciun catel cazat!");
        else {
            for(Caine c : listaCaini){
                System.out.println(c.getNume() + " " + c.getVarsta() + " " + c.getGreutate());
            }
        }
    }

    public void cainiBatrani(int varsta){
        for(Caine c : listaCaini){
            if(c.getVarsta() > varsta){
                System.out.println(c.getNume() + " " + c.getVarsta());
            }
        }
    }

    public void sortareDupaVarsta(){
        Collections.sort(listaCaini);
    }

}
