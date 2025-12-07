package lab8.ex5;

public class Masina implements Cloneable{

    private String marca;
    private String culoare;

    public Masina(String marca, String culoare) {
        this.marca = marca;
        this.culoare = culoare;
    }

    public void revopseste(String culoareNoua){
        this.culoare = culoareNoua;
        System.out.println("Masina " + this.marca + " a fost revopsita in culoarea " + culoareNoua);
    }

    public String getCuloare(){
        return this.culoare;
    }

    @Override
    public String toString(){
        return "Masina sa are marca: " + marca + " si culoarea: " + culoare;
    }

    @Override
    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }
}
