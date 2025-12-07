package lab8.ex6;

public class Main {

    public static void primesteA(OperatiiA objA) {
        objA.metodaA1();
        objA.metodaA2();
    }

    public static void primesteB(OperatiiB objB) {
        objB.metodaB1();
        objB.metodaB2();
    }

    public static void primesteC(OperatiiC objC) {
        objC.metodaC1();
        objC.metodaC2();
    }

    public static void primesteComplex(OperatiiComplexe objComplex) {
        objComplex.metodaA1();
        objComplex.metodaB2();
        objComplex.metodaC1();
        objComplex.metodaNoua();
    }
    public static void main(String[] args) {

        Complet obiect = new Complet();
        obiect.metodaMostenita();

        primesteA(obiect);
        primesteB(obiect);
        primesteC(obiect);

        primesteComplex(obiect);
    }
}
