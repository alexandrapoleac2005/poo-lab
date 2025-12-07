package lab5.ex2;

public class Complex{

    private int Re;
    private int Im;

    public Complex(int Re, int Im){
        this.Re = Re;
        this.Im = Im;
    }

    public int getRe(){
        return Re;
    }

    public int getIm(){
        return Im;
    }

    public void setRe(int value){
        this.Re = value;
    }

    public void setIm(int value){
        this.Im = value;
    }

    public Complex add(Complex c){
        int Re = this.Re + c.Re;
        int Im = this.Im + c.Im;
        return new Complex(Re, Im);
    }

    public Complex sub(Complex c){
        Re = this.Re - c.Re;
        Im = this.Im - c.Im;
        return new Complex(Re, Im);
    }

    public Complex mul(Complex c){
        int Re = (this.Re * c.Re) * (-1) + this.Im * c.Im;
        int Im = this.Re * c.Im + c.Re* this.Im;
        return new Complex(Re, Im);
    }

    public Complex sMul(int value){
        int Re = this.Re * value;
        int Im = this.Im * value;
        return new Complex(Re, Im);
    }

    public String toString(){
        if (Im >= 0)
            return Re + " + " + Im + "i";
        else
            return Re + " - " + (-Im) + "i";
    }
}