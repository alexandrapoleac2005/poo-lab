package lab8.ex6;

public class Complet extends ClasaBaza implements OperatiiComplexe{

    @Override
    public void metodaA1() {
        System.out.println("Metoda A1");
    }

    @Override
    public void metodaA2() {
        System.out.println("Metoda A2");
    }

    @Override
    public void metodaB1(){
        System.out.println("Metoda B1");
    }

    @Override
    public void metodaB2(){
        System.out.println("Metoda B2");
    }

    @Override
    public void metodaC1(){
        System.out.println("Metoda C1");
    }

    @Override
    public void metodaC2(){
        System.out.println("Metoda C2");
    }

    @Override
    public void metodaNoua(){
        System.out.println("Se executa din clasa copil");
    }
}
