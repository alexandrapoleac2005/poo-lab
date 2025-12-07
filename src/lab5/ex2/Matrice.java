package lab5.ex2;

public class Matrice {

    private Complex[][] mat;
    private int n;
    private int m;

    public Matrice(int n, int m){
        this.n = n;
        this.m = m;
        mat = new Complex[n][m];

        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++)
                mat[i][j] = new Complex(0, 0);
    }

    public Complex get(int i, int j){
        return mat[i][j];
    }

    public void set(int i, int j, Complex value){
        mat[i][j] = value;
    }

    public Matrice add(Matrice mat2){

        Matrice rez = new Matrice(n, m);
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                rez.set(i, j, mat[i][j].add(mat2.get(i,j)));
            }
        }
        return rez;
    }

    public Matrice mul(Matrice mat2){

        Matrice rez = new Matrice(this.n, mat2.m);
        for (int i = 0; i < this.n; i++){
            for(int j = 0; j < mat2.m ; j++){
                Complex sum = new Complex(0, 0);
                for(int k = 0; k < this.m; k++) {
                    sum = sum.add(this.get(i,k).mul(mat2.get(k,j)));
                }
                rez.set(i, j, sum);
            }
        }
        return rez;
    }

    public Matrice sMul(int value){

        Matrice rez = new Matrice(n, m);
        for(int i = 0; i < n; i++){
            for(int j =  0; j < m; j++){
                rez.set(i, j, mat[i][j].sMul(value));
            }
        }
        return rez;
    }

    public void afisare() {

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){

                System.out.print(this.get(i,j) + " ");
            }
            System.out.println();
        }
    }
}