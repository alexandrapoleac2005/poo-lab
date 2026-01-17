package lab9.ex3;

public class Main {
    public static void main(String[] args) {

        int[] vector = new int[3];

        try {
            int valoare = vector[4];
        }
        catch(IndexOutOfBoundsException ex){

            System.out.println("Se incearca accesarea unui element care nu se afla in vector");
            System.out.println(ex.getMessage());
        }
    }
}
