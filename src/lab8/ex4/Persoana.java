package lab8.ex4;

public class Persoana implements Comparable<Persoana> {

    private String nume;
    private String prenume;
    private int varsta;

    public Persoana(String nume, String prenume, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }
    public int compareTo(Persoana p){
        return nume.compareTo(p.nume);
    }

    @Override
    public String toString() {
        return nume + " " + prenume + " " + varsta + " ani";
    }
}

