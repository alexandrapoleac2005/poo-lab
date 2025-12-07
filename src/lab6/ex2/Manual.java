package lab6.ex2;

public class Manual extends Rechizita{


    public Manual(String eticheta){
        super(eticheta);
    }

    @Override
    public String getNume(){
        return "Manual";
    }

    @Override
    public String toString(){
        return eticheta;
    }
}
