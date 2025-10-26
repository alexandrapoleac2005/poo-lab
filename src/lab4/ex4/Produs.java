package lab4.ex4;

public class Produs {

    private String marca;
    private double pret;
    private int nrBucati;
    private int stocMaxim;

    public Produs(String marca, double pret, int nrBucati, int  stocMaxim) {
        this.marca = marca;
        this. pret = pret;
        this.nrBucati = nrBucati;
        this.stocMaxim = stocMaxim;
    }


    // Gettere si Settere
    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public double getPret(){
        return pret;
    }

    public void setPret(double pret){
        this.pret = pret;
    }

    public int getNrBucati(){
        return nrBucati;
    }

    public void setNrBucati(int nrBucati){
        this.nrBucati = nrBucati;
    }

    public int getStocMaxim(){
        return stocMaxim;
    }

    public void setStocMaxim(int stocMaxim){
        this.stocMaxim = stocMaxim;
    }

    public void adaugaMarfa(int valoare){
        int total = valoare + getNrBucati();
        if( total > getStocMaxim()){
            setStocMaxim(total);
            System.out.print(" stocul este plin!");
        }
        else {
            setNrBucati(total);
            System.out.print(" avem " + total + " produse pe stoc");
        }
    }

    public void cumparaMarfa( int valoare) {
        int total =getNrBucati() - valoare;
        if(total < 0) {
           System.out.print(" stocul e indisponibil, mai avem doar bucati " + getNrBucati() + " pe stoc din " + valoare);

        }
        else {
            setNrBucati(total);
            System.out.print(" avem " + total + " produse pe stoc");
        }
    }

    public double total (){
        return getPret() *  getNrBucati();
    }

}
