package PARTIAL_lab7;

public abstract class Planta {

    private String nume;
    private int varsta;
    private double inaltime;

    public Planta(String nume, int varsta, double inaltime){
        this.nume = nume;
        this.varsta = varsta;
        this.inaltime = inaltime;
    }


    public String getNume() {
        return nume;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }
    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public double getInaltime() {
        return inaltime;
    }
    public void setInaltime(double inaltime) {
        this.inaltime = inaltime;
    }

    public String descriere(){
        return "Planta " + nume + " are varsta " + varsta + " si inaltimea " + inaltime;
    }

    abstract public String activitate();

}
