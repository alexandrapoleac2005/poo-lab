package lab10.ex5;

public class Main {
    public static void main(String[] args) {

       Caine caine1 = new Caine("Aldo", 3, 10);
       Caine caine2 = new Caine("Max", 10, 38.5);
       Caine caine3 = new Caine("Boxie", 8, 15);

       PetHotel hotel = new PetHotel("Hotel canin", "Cluj-Napoca");
       hotel.inregistrareCamera(caine1);
       hotel.inregistrareCamera(caine2);
       hotel.inregistrareCamera(caine3);

       hotel.listaCazare();
       System.out.println();

       hotel.cainiBatrani(5);
       System.out.println();

       hotel.sortareDupaVarsta();
       hotel.listaCazare();
       System.out.println();

       hotel.eliberareCamera(caine1);
       hotel.listaCazare();
    }
}
