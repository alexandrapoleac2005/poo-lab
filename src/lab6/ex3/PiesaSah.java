package lab6.ex3;

public abstract class PiesaSah {

    protected String numePiesa;
    protected int coordX;
    protected int coordY;

    PiesaSah(String numePiesa, int coordX, int coordY) {
        this.numePiesa = numePiesa;
        this.coordX = coordX;
        this.coordY = coordY;
    }

    abstract public boolean mutaPiesa(int new_coordX, int new_coordY, PiesaSah[][] tabla);

    public String getNumePiesa() {
        return numePiesa;
    }

    protected boolean estePeTabla(int x, int y){
        return x >= 1 && x <= 8 && y >= 1 && y <= 8;
    }

    protected int getCoordX() {
        return coordX;
    }

    protected int getCoordY() {
        return coordY;
    }
}
