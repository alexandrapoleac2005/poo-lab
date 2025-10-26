package lab4.ex2;

public class Rezervor {

    private double capMaxima;
    private double nivelUmplere;

    // Constructor
    public Rezervor(double capMaxima, double nivelUmplere){
        this.capMaxima = capMaxima;
        this.nivelUmplere = nivelUmplere;
    }

    // Gettere si Settere
    public double getNivel(){
        return nivelUmplere;
    }

    public void setNivel(double capacitate){
        this.nivelUmplere = capacitate;
    }

    public double getCapacitateMaxima(){
        return capMaxima;
    }

    public void setCapacitateMaxima(double capacitateMaxima){
        this.capMaxima = capacitateMaxima;
    }

    // Metoda pentru umplere a rezervorului
    public void umplere(double valoare){
        double cantitate = getNivel() + valoare;
        if(cantitate > getCapacitateMaxima()){
             setNivel(getCapacitateMaxima());
             System.out.println("Rezervorul este plin");
        }
        else
        {
            setNivel(cantitate);
            System.out.println("Avem: " +  cantitate + " de litri in rezervor");
        }
    }

    // Metoda pentru golire a rezervorului
    public void golire (double valoare){

        double cantitate = getNivel() - valoare;
        if(cantitate < 0){
            setNivel(0);
            System.out.println("Rezervorul este golit");
        }
        else
        {
            setNivel(cantitate);
            System.out.println("Avem: " +  cantitate + " de litri in rezervor");
        }
    }
}
