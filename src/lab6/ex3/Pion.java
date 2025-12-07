package lab6.ex3;

public class Pion extends PiesaSah {

    private static final int DIRECTIE_MISCARE = 1;
    public Pion(String numePiesa, int coordX, int coordY){
        super(numePiesa, coordX, coordY);
    }

    @Override
    public boolean mutaPiesa(int new_coordX, int new_coordY, PiesaSah[][] tabla){
        if(!estePeTabla(new_coordX, new_coordY)){
            System.out.println("Mutare invalida.");
            return false;
        }

        int mutareX = new_coordX - coordX;
        int mutareY = Math.abs(new_coordY - coordY);

        boolean mutareValida = (mutareX == DIRECTIE_MISCARE && mutareY == 0);

        if(mutareValida){

            tabla[coordX -1][coordY - 1] = null;

            this.coordX = new_coordX;
            this.coordY = new_coordY;

            tabla[coordX - 1][coordY - 1] = this;
            System.out.println(this.getNumePiesa() + " a fost mutat la pozitia " + this.coordX + ", " + this.coordY);
            return true;
        }
        else {
            System.out.println("Mutare invalida.");
            return false;
        }
    }
}
