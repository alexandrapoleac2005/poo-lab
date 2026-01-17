package lab8.ex2;

public class Matrice implements Numeric{

    private int linii;
    private int coloane;
    private Numeric[][] matrice;

    public Matrice(int linii, int coloane){
        this.linii = linii;
        this.coloane = coloane;
        this.matrice = new Numeric[linii][coloane];
    }

    public Numeric getElement(int linii, int coloane){
        return this.matrice[linii][coloane];
    }

    public void setElement(int linii, int coloane, Numeric valoare){
        this.matrice[linii][coloane] = valoare;
    }

    public int getLinii() {
        return linii;
    }

    public void setLinii(int linii) {
        this.linii = linii;
    }

    public int getColoane() {
        return coloane;
    }

    public void setColoane(int coloane) {
        this.coloane = coloane;
    }

    @Override
    public Object aduna(Object obj){

        Matrice mat = (Matrice)obj;
        Matrice rezultat = new Matrice(this.linii, this.coloane);

        for(int i = 0; i < this.linii; i++){
            for(int j = 0; j < this.coloane; j++){

                Numeric suma = (Numeric) this.matrice[i][j].aduna(mat.matrice[i][j]);
                rezultat.setElement(i, j, suma);
            }
        }
        return rezultat;
    }

    @Override
    public Object scade(Object obj){

        Matrice mat = (Matrice)obj;
        Matrice rezultat = new Matrice(this.linii, this.coloane);

        for(int i = 0; i < this.linii; i++){
            for(int j = 0; j < this.coloane; j++){

                Numeric dif = (Numeric)this.matrice[i][j].scade(mat.matrice[i][j]);
                rezultat.setElement(i, j, dif);
            }
        }
        return rezultat;
    }

    @Override
    public Object inmulteste(Object obj){

        Matrice mat = (Matrice)obj;
        Matrice rezultat =  new Matrice(this.linii, this.coloane);

        Numeric zero = null;
        if(this.matrice[0][0] instanceof Complex){
            zero = new Complex(0, 0);
        }
        else if(this.matrice[0][0] instanceof Fractie){
            zero = new Fractie(0, 1);
        }

        for(int i = 0; i < this.linii; i++){
           for(int j = 0; j < mat.coloane; j++){

               Numeric suma = zero;

               for(int k = 0; k < this.coloane; k++){
                   Numeric termen = (Numeric) this.matrice[i][k].inmulteste(mat.matrice[k][j]);
                   suma = (Numeric)suma.aduna(termen);
               }
               rezultat.setElement(i, j, suma);
           }
        }
        return rezultat;
    }

    public Object inmultireScalar(Numeric scalar){

        Matrice rezultat = new Matrice(this.linii, this.coloane);
        for(int i = 0; i < this.linii; i++){
            for(int j = 0; j < this.coloane; j++){

                Numeric valoare = (Numeric)this.matrice[i][j].inmulteste(scalar);
                rezultat.setElement(i, j, valoare);
            }
        }
        return rezultat;
    }

    public void afiseaza() {
        for(int  i = 0; i < this.linii; i++){
            for(int  j = 0; j < this.coloane; j++){
                System.out.println(matrice[i][j].toString() + " ");
            }
            System.out.println();
        }
    }
}
