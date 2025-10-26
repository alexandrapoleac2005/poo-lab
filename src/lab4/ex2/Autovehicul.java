package lab4.ex2;
import java.awt.*;

public class Autovehicul {

    // Constanta caracteristica
    public static final double CONSUM_MEDIU = 7.0;

    // Variabile instanta
    private String marca;
    private Color culoare;
    private double vitCurenta;
    private int treaptaCurenta;
    private double vitMaxima;
    private int treaptaMaxima;


    // Variabile instanta referitoare la sofer si rezervor
    private Sofer sofer;
    private Rezervor rezervor;

    // Constructor cu parametru
    public Autovehicul(String marca, Color culoare, double vitMaxima, int treaptaMaxima) {
        this.marca = marca;
        this.culoare = culoare;
        this.vitMaxima = vitMaxima;
        this.treaptaMaxima = treaptaMaxima;
        this.vitCurenta = 0;
        this.treaptaCurenta = 1;
    }

    // Constructor fara parametru
    public Autovehicul(){
        this.marca = "BMW";
        this.culoare = Color.BLACK;
        this.vitMaxima = 300;
        this.treaptaMaxima = 6;
        this.vitCurenta = 0;
        this.treaptaCurenta = 1;
    }

    // Getter pentru viteze - CURENTA si MAXIMA
    public double getViteza(){
        return vitCurenta;
    }

    public double getVitezaMaxima(){
        return vitMaxima;
    }

    // Setter pentru viteze - CURENTA si MAXIMA
    public void setViteza(double viteza){
        this.vitCurenta = viteza;
    }

    public void setVitezaMaxima(double vitezaMaxima){
        this.vitMaxima = vitezaMaxima;
    }

    // Metoda care creste viteza masinii
    public void accelerare(double viteza){

        double accelerat = getViteza() + viteza;
        if(accelerat <= getVitezaMaxima()) {
            setViteza(accelerat);
            System.out.println("Viteza a ajuns la: " + accelerat + " km/h");
        }
        else
        {
            setViteza(getVitezaMaxima());
            System.out.println("Masina nu permite aceasta viteza");
        }
    }

    // Metoda care scade viteza masinii
    public void decelerare(double viteza){

        double decelerat = getViteza() - viteza;
        if(decelerat > 0)
        {
            setViteza(decelerat);
            System.out.println("Viteza a ajuns la: " +  decelerat + " km/h");
        }
        else
        {
            setViteza(0);
            System.out.println("Am franat");
        }
    }


    // Getter treapta de viteza - CURENTA si MAXIMA
    public int getTreapta (){
        return treaptaCurenta;
    }

    public int getTreaptaMaxima(){
        return treaptaMaxima;
    }

    // Setter treapta de viteza - CURENTA SI MAXIMA
    public void setTreapta(int treapta){
        this.treaptaCurenta = treapta;
    }

    public void setTreaptaMaxima(int treaptaMaxima){
        this.treaptaMaxima = treaptaMaxima;
    }

    // Metoda care schimba viteza
    // sens este folosit pentru a vedea daca crestem sau scadem treapta
    public void schimbaViteza(int valoare, boolean sens){
        int treapta;
        if(!sens)
            treapta = getTreapta() - valoare;
        else treapta =  getTreapta() + valoare;

         if( treapta > treaptaMaxima || treapta < 1 )
             System.out.println("Imposibil");
         else {
             setTreapta(treapta);
             System.out.println("Suntem in treapta a: " + treapta + "-a");
         }

    }

    public void oprire(){
        setViteza(0);
        setTreapta(1);
        System.out.println("Masina este oprita");
    }


    // Getter pentru CULOARE si MARCA
    public String getMarca(){
        return marca;
    }

    public Color getCuloare(){
        return culoare;
    }

    // Setter pentru CULOARE si MARCA
    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setCuloare(Color culoare){
        this.culoare = culoare;
    }

    public String toString(){
        String text = "";
        text += "Starea curenta a automobilului este: \n";
        text += "Marca: " + getMarca() + "\n";
        text += "Culoare: " + getCuloare() + "\n";
        text += "Viteza: " + getViteza() + "\n";
        text += "Treapta: " + getTreapta() + "\n";

        return text;
    }


    public Autovehicul info(String marca){
        return new Autovehicul(marca, Color.BLACK, 300, 6);


    }
    public Autovehicul info(String marca,  Color culoare){
        return new Autovehicul(marca, culoare, 300, 6);
    }
}
