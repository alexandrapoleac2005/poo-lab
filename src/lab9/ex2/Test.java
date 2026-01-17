package lab9.ex2;

public class Test {
    public static void main(String[] args) {

        String text = null;

        try{
            int lungime = text.length();
        }
        catch(NullPointerException ex){
            System.out.println("Se va intercepta Null Pointer Exception");
            System.out.println(ex.getMessage());
        }


    }
}
