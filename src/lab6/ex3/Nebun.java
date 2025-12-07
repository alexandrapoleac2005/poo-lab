package lab6.ex3;

public class Nebun extends PiesaSah {

    public Nebun(String numePiesa, int coordX, int coordY){
        super(numePiesa, coordX, coordY);
    }

    @Override
    public boolean mutaPiesa(int new_coordX, int new_coordY, PiesaSah[][] tabla){
        if(!estePeTabla(new_coordX, new_coordY)){
            System.out.println("Mutare invalida.");
            return false;
        }

        int mutareX = Math.abs(new_coordX - coordX);
        int mutareY = Math.abs(new_coordY - coordY);

        if(mutareX == mutareY && mutareX != 0) {

            tabla[coordX - 1][coordY - 1] = null;
            coordX = new_coordX;
            coordY = new_coordY;

            tabla[coordX - 1][coordY - 1] = this;
            System.out.println(this.getNumePiesa() + " a fost mutat la pozitia " + coordX + ", " + coordY);
            return true;
        }
        else {
            System.out.println("Mutare invalida.");
            return false;
        }
    }
}
