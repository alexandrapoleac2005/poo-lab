package PARTIAL_lab7;

public class Cactus extends Planta {

    private double cantitateApa;
    private boolean spiniMari;

    public Cactus(double cantitateApa, boolean spiniMari, String nume, int varsta, double inaltime){
        super(nume, varsta, inaltime);
        this.cantitateApa = cantitateApa;
        this.spiniMari = spiniMari;
    }

    public double getCantitateApa() {
        return cantitateApa;
    }
    public void setCantitateApa(double cantitateApa) {
        this.cantitateApa = cantitateApa;
    }

    public boolean isSpiniMari() {
        return spiniMari;
    }
    public void setSpiniMari(boolean spiniMari) {
        this.spiniMari = spiniMari;
    }

    public String descriere(){
        String descriere = "";
        descriere += "Cactusul " + super.getNume() + " cu varsta " + super.getVarsta() + " si inaltimea " + super.getInaltime() +
                " are nevoie de " + cantitateApa + " litri de apa saptamanal " + " iar spinii sai sunt ";
        if(isSpiniMari()) descriere += " mari";
        else descriere += " mici";
        return descriere;
    }

    public String activitate(){
        return "Cactusul stocheaza apa";
    }

    public void stocheazaApa(){
        setCantitateApa(getCantitateApa() - 2);
    }
}
