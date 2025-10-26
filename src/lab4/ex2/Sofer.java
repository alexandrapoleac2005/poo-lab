package lab4.ex2;

public class Sofer {

    // Variabile instanta
    private String nume;
    private String prenume;
    private int varsta;
    private String nrPermis;

    // Constructor
    public Sofer (String nume, String prenume, int varsta, String nrPermis){
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.nrPermis = nrPermis;
    }


    // Gettere si Settere
    public String getNume(){
        return nume;
    }

    public void setNume(String nume){
        this.nume = nume;
    }

    public String getPrenume(){
        return prenume;
    }

    public void setPrenume(String prenume){
        this.prenume = prenume;
    }

    public int getVarsta(){
        return varsta;
    }

    public void setVarsta(int varsta){
        this.varsta = varsta;
    }

    public String getNrPermis(){
        return nrPermis;
    }

    public void setNrPermis(String nr_permis){
        this.nrPermis = nrPermis;
    }


}
