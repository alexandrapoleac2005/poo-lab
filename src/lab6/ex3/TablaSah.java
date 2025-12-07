package lab6.ex3;

public class TablaSah {

    private PiesaSah[][] tabla = new PiesaSah[8][8];

    public TablaSah() {
        initializareTabla();
    }

    private void initializareTabla() {

        Nebun nebun1 = new Nebun("Nebun 1", 1, 3);
        tabla[nebun1.getCoordX() - 1][nebun1.getCoordY() - 1] = nebun1;

        Tura tura1 = new Tura("Tura 1", 1, 1);
        tabla[tura1.getCoordX() - 1][tura1.getCoordY() - 1] = tura1;

        Pion pion1  = new Pion("Pion 1", 2, 4);
        tabla[pion1.getCoordX() - 1][pion1.getCoordY() - 1] = pion1;

    }

    public PiesaSah getPiesa(int x, int y){

        if(x >= 1 && x <= 8 && y >= 1 && y <= 8) {
            return tabla[x - 1][y - 1];
        }
        return null;
    }

    public PiesaSah[][] getTabla(){
        return tabla;
    }

    public void afiseazaTabla(){
        System.out.println("  ---------------------------------");

        for(int i = 7; i >= 0; i--) {
            System.out.print((i + 1) + " |");
            for(int j = 0; j < 8; j++){
                PiesaSah piesa = tabla[i][j];
                String simbol;

                if(piesa != null) {
                    if(piesa instanceof Pion) simbol = "P";
                    else if(piesa instanceof Tura) simbol = "T";
                    else simbol = "N";
                }
                else simbol = " ";
                System.out.print(" " + simbol + " |");
            }

            System.out.println();
            System.out.println("  ---------------------------------");
        }
        System.out.println("X   1   2   3   4   5   6   7   8  Y");
    }
}
