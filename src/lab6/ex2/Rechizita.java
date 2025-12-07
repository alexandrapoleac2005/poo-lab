package lab6.ex2;

public abstract class Rechizita {

    protected String eticheta;

    public Rechizita(String eticheta){
        this.eticheta = eticheta;
    }

    public abstract String getNume();

    @Override
    public String toString(){
        return eticheta;
    }

}
