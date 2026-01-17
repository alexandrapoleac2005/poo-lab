package lab9.ex6;

public class OClasa {

    public void g() throws ExceptieNoua {
        throw new ExceptieNoua("Eroare produsa in g()");
    };

    public void f() throws ExceptieNoua2 {
        try{
            g();
        }
        catch (ExceptieNoua ex){
            System.out.println("f() a prins " + ex.getMessage());
            throw new ExceptieNoua2();
        }
    }
}
