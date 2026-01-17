package lab9.ex1;

public class ExceptieZiNelucratoare extends Exception{

    public ExceptieZiNelucratoare(String mesaj){
        super(mesaj);
    }

    public ExceptieZiNelucratoare(){
        super("Aceasta e o exceptie");
    }
}
