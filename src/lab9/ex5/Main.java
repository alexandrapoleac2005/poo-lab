package lab9.ex5;

public class Main {
    public static void main(String[] args) {

        ClasaMea clasa = new ClasaMea();
        try{

          clasa.oMetoda();

        }
        catch(ExceptiaMea e){
            System.out.println(e.getMessage());
        }
    }
}
