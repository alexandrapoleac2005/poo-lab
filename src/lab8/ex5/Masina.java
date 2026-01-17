package lab8.ex5;

public class Masina implements Cloneable {

    private String marca;
    private String culoare;

    public Masina(String marca, String culoare) {
        this.marca = marca;
        this.culoare = culoare;
    }

    public void revopseste(String culoareNoua){
        this.culoare = culoareNoua;
    }

    @Override
    public Masina clone() throws CloneNotSupportedException {
        return (Masina) super.clone();
    }

    @Override
    public String toString(){
        return marca + " " + culoare;
    }

}
