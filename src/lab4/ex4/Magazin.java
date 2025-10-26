package lab4.ex4;

public class Magazin {

    private String numeMagazin;
    private Produs produs;

    public Magazin(String numeMagazin, Produs produs){
        this.numeMagazin = numeMagazin;
        this.produs = produs;
    }

    public String getNumeMagazin(){
        return numeMagazin;
    }

    public Produs getProdus(){
        return produs;
    }

    // Metoda care vinde o cantitate din produs
    public void vindeProdus(int cantitate){
        System.out.print("La magazinul " + getNumeMagazin() );
        produs.cumparaMarfa(cantitate);
        System.out.print(" din gama " + produs.getMarca());
    }

    public void aprovizioneazaProdus(int cantitate){
        System.out.print("La magazinul " +  getNumeMagazin() );
        produs.adaugaMarfa(cantitate);
        if(produs.getNrBucati() > 0)
        System.out.print(" din gama " + produs.getMarca());
    }

    public void totalProdus () {
        System.out.print("La magazinul " + getNumeMagazin() + " avem produse de la marca " + produs.getMarca() +
                " in valoare de: " + produs.total() + " de lei");
    }

}
