package lab9.ex4;

public class Main {
    public static void main(String[] args) {

       try{

           throw new Exception("TEST");
       }
       catch(Exception e){

           System.out.println("Mesaj din interiorul lui catch");
           System.out.println("Exceptia aruncata are mesajul: " + e.getMessage());
       }
       finally{

           System.out.println("Se afiseaza indiferent");
       }

    }
}
