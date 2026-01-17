package lab10.ex4;

import java.util.ArrayList;
import java.util.List;

public class FacebookAccount {

    private String nume;
    private int varsta;
    private String locatie;
    private List<FacebookAccount> listaPrieteni;

    public FacebookAccount(String nume, int varsta, String locatie){
        this.nume = nume;
        this.varsta = varsta;
        this.locatie = locatie;
        this.listaPrieteni = new ArrayList<>();
    }

    public String getNume(){ return this.nume; }
    public void setNume(String nume){  this.nume = nume; }
    public int getVarsta(){ return this.varsta; }
    public void setVarsta(int varsta){ this.varsta = varsta; }
    public String getLocatie(){ return this.locatie; }
    public void setLocatie(String locatie){ this.locatie = locatie; }
    public List<FacebookAccount> getListaPrieteni() { return listaPrieteni; }

   public void adaugaPrieten(FacebookAccount prieten){
        if(!listaPrieteni.contains(prieten))
            listaPrieteni.add(prieten);
        else System.out.println(prieten.nume + " este deja prieten cu " + this.nume);
   }

   public void stergerePrieten(FacebookAccount prieten){
       if(listaPrieteni.remove(prieten)) listaPrieteni.remove(prieten);
       else System.out.println(prieten.getNume() + " nu este prieten cu " + this.nume);
   }

   public void afisarePrieten(){
        if(listaPrieteni.isEmpty()) System.out.println("Nu aveti niciun prieten adaugat!");
        else {
            for(FacebookAccount prieten: listaPrieteni) {
                System.out.println(prieten.nume + " " + prieten.locatie);
            }
        }
   }

   public void prieteniLocatieData(String locatie){
        if(listaPrieteni.isEmpty()) System.out.println("Nu aveti niciun prieten adaugat!");
        else{
            for(FacebookAccount prieten: listaPrieteni){
                if(prieten.locatie.equals(locatie)){
                    System.out.println(prieten.nume);
                }
            }
        }
   }
}
