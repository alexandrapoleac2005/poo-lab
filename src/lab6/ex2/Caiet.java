package lab6.ex2;

public class Caiet extends Rechizita{

    public Caiet(String eticheta){
        super(eticheta);
    }

    @Override
    public String getNume(){
        return "Caiet";
    }

    @Override
    public String toString(){
        return eticheta;
    }
}
