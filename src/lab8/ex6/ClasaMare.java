package lab8.ex6;

public class ClasaMare extends ClasaBaza implements InterfataMare{

    @Override
    public void metoda1A(){
        System.out.println("Metoda 1A");
    }

    @Override
    public void metoda1B(){
        System.out.println("Metoda 1B");
    }

    @Override
    public void metoda1C(){
        System.out.println("Metoda 2A");
    }

    @Override
    public void metoda2A(){
        System.out.println("Metoda 2A");
    }

    @Override
    public void metoda2B(){
        System.out.println("Metoda 2B");
    }

    @Override
    public void metoda2C(){
        System.out.println("Metoda 2C");
    }

    public void metodaNoua(){
        System.out.println("Aceasta se executa din clasa copil");
    }



}
