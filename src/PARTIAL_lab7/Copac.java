package PARTIAL_lab7;

public class Copac extends Planta{

    private double diametru;
    private boolean esteVerde;

    public Copac(double diametru, boolean esteVerde, String nume, int varsta, double inaltime){
        super(nume, varsta, inaltime);
        this.diametru = diametru;
        this.esteVerde = esteVerde;
    }

    public double getDiametru() {
        return diametru;
    }
    public void setDiametru(double diametru) {
        this.diametru = diametru;
    }

    public boolean isEsteVerde() {
        return esteVerde;
    }
    public void setEsteVerde(boolean esteVerde) {
        this.esteVerde = esteVerde;
    }

    public String descriere(){
        String descriere = "";
        descriere += "Copacul " + super.getNume() + " cu varsta " + super.getVarsta() + " si inaltimea " + super.getInaltime() +
                " are diametrul trunchiului " +
                diametru + " iar frunzele ";
        if(esteVerde) descriere += "sunt verzi";
        else descriere += " nu sunt vesnic verzi";
        return descriere;
    }

    public String activitate(){
       return "Copacul produce oxigen";
    }

    public void creste(){
        setInaltime(getInaltime() + 5);
    }

}


