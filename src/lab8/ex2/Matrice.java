package lab8.ex2;

public class Matrice implements Numeric {

    private Numeric[][] matrice;
    private int linii;
    private int coloane;

    public Matrice(int linii, int coloane){

        this.linii = linii;
        this.coloane = coloane;
        this.matrice = new Numeric[linii][coloane];
    }

    public void setElement(int linie, int coloana, Numeric valoare){
        this.matrice[linie][coloana] = valoare;
    }

    public Numeric getElement(int linie, int coloana){
        return this.matrice[linie][coloana];
    }

    public int getLinii(){
        return this.linii;
    }
    public int getColoane(){
        return this.coloane;
    }

    @Override
    public Object aduna (Object obj){

        Matrice mat = (Matrice) obj;
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
        Matrice mat = (Matrice) obj;
        Matrice rezultat = new Matrice(this.linii, this.coloane);
        for(int i = 0; i < this.linii; i++){
            for(int j = 0; j < this.coloane; j++){

                Numeric dif = (Numeric) this.matrice[i][j].scade(mat.matrice[i][j]);
                rezultat.setElement(i, j, dif);
            }
        }
        return rezultat;
   }

   @Override
   public Object inmulteste(Object obj){
       Matrice mat = (Matrice) obj;

       Numeric zero = null;
       if(this.matrice[0][0] instanceof Fractie) {
           zero = new Fractie(0, 1);
       } else if(this.matrice[0][0] instanceof Complex) {
           zero = new Complex(0, 0);
       }

       Matrice rezultat = new Matrice(this.linii, mat.coloane);

       for(int i = 0; i < this.linii; i++) {
           for(int j = 0; j < mat.coloane; j++) {
               Numeric suma = zero;

               for(int k = 0; k < this.coloane; k++) {
                   Numeric termen = (Numeric) this.matrice[i][k].inmulteste(mat.matrice[k][j]);
                   suma = (Numeric) suma.aduna(termen);
               }
               rezultat.setElement(i, j, suma);
           }
       }
       return rezultat;
   }

   public Object inmulScalar(Numeric scalar){

        Matrice rezultat = new Matrice(this.linii, this.coloane);
        for(int i = 0; i < this.linii; i++){
            for(int j = 0; j < this.coloane; j++){

                Numeric inm = (Numeric) this.matrice[i][j].inmulteste(scalar);
                rezultat.setElement(i, j, inm);
            }
        }
        return rezultat;
   }

   public void afiseaza(){
        for(int i = 0; i < this.linii; i++){
            for(int j = 0; j < this.coloane; j++){
                System.out.print(matrice[i][j].toString());
                System.out.print(" ");
            }
            System.out.println();
        }
   }
}
