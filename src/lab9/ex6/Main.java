package lab9.ex6;

public class Main {
    public static void main(String[] args) {

        OClasa clasa =  new OClasa();
        try{
            clasa.f();
        }
        catch(ExceptieNoua2 ex){
            System.out.println("Main a prins :" + ex.getMessage());
        }
    }
}
