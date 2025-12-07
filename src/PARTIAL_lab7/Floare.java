package PARTIAL_lab7;
import java.awt.*;

public class Floare extends Planta{

     private Color culoare;
     private int nrFlori;

     public Floare(Color culoare, int nrFlori, String nume, int varsta, double inaltime){
         super(nume, varsta, inaltime);
         this.culoare = culoare;
         this.nrFlori = nrFlori;
     }

     public Color getCuloare(){
         return culoare;
     }
     public void setCuloare(Color culoare){
         this.culoare = culoare;
     }

     public int getNrFlori(){
         return nrFlori;
     }
     public void setNrFlori(int nrFlori){
         this.nrFlori = nrFlori;
     }

     public String descriere(){
        return "Floarea " + super.getNume() + " cu varsta " + super.getVarsta() + " si inaltimea " + super.getInaltime() +
                " are culoarea petalelor " + culoare + " iar pe luna pot inflori " + nrFlori;
     }

    public String activitate(){
        return "Floarea infloreste";
    }

    public void infloreste(){
        setNrFlori(getNrFlori() + 1);
    }
}
