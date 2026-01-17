package lab10.ex5;

public class Caine implements Comparable<Caine>  {

    private String nume;
    private int varsta;
    private double greutate;

    public Caine(String nume, int varsta, double greutate){
        this.nume = nume;
        this.varsta = varsta;
        this.greutate = greutate;
    }

    public String getNume(){ return this.nume; }
    public int getVarsta(){ return this.varsta; }
    public double getGreutate(){ return this.greutate; }
    public void setNume(String nume){ this.nume = nume; }
    public void setVarsta(int varsta){ this.varsta = varsta; }
    public void setGreutate(double greutate){ this.greutate = greutate; }

    @Override
    public String toString(){
        return this.nume + " " + this.varsta + " " + this.greutate;
    }
    @Override
    public int compareTo(Caine altCaine){
        return Integer.compare(this.varsta, altCaine.varsta);
    }

}
