package lab6.ex3;

public class Tura extends PiesaSah {

    public Tura(String numePiesa, int coordX, int coordY){
        super(numePiesa, coordX, coordY);
    }

    @Override
    public boolean mutaPiesa(int new_coordX, int new_coordY, PiesaSah[][] tabla){

        if(!estePeTabla(new_coordX, new_coordY)){
            System.out.println("Mutare invalida.");
            return false;
        }

        boolean mutareOrizontala = (coordX == new_coordX && coordY != new_coordY);
        boolean mutareVerticala =  (coordY == new_coordY && coordX != new_coordX);

        if(mutareVerticala || mutareOrizontala){

            tabla[coordX - 1][coordY - 1] = null;

            this.coordX = new_coordX;
            this.coordY = new_coordY;

            tabla[coordX - 1][coordY] = this;
            System.out.println(this.getNumePiesa() + " a fost mutata la pozitia " + coordX + ", " + coordY);
            return true;
        }
        else {
            System.out.println("Mutare invalida.");
            return false;
        }
    }
}
