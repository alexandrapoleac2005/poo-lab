package lab8.ex4;

public class Persoana implements Comparable<Persoana>{

    private String nume;
    private String prenume;
    private int varsta;

    public Persoana(String nume, String prenume, int varsta){
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    /*@Override
    public int compareTo(Persoana p){
        return this.nume.compareTo(p.nume);
    }*/

    @Override
    public int compareTo(Persoana p){
        return Integer.compare(this.varsta, p.varsta);
    }

    @Override
    public String toString(){
        return this.nume + " " + this.prenume + " " + this.varsta;
    }
}

