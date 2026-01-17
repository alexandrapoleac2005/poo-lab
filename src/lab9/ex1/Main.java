package lab9.ex1;

public class Main {
    public static void main(String[] args) {

        CalendarLucru calendar = new CalendarLucru();
        Lucrator l = new Lucrator("Gigel", calendar);

        try{
           l.lucreaza("Luni");
        }
        catch (ExceptieZiNelucratoare ex){
            System.out.println(ex.getMessage());
        }

        try{
            l.lucreaza("Marte");
        }
        catch (ExceptieZiNelucratoare ex){
            System.out.println(ex.getMessage());
        }

        try{
            l.lucreaza("Duminica");
        }
        catch(ExceptieZiNelucratoare ex){
            System.out.println(ex.getMessage());
        }
    }
}
