package lab8.ex2;

public class Complex implements Numeric{

    private double real;
    private double imag;

    public Complex(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    @Override
    public Object aduna(Object obj){

        if(obj instanceof Complex){

            Complex complex = (Complex) obj;
            return new Complex(this.real + complex.real, this.imag + complex.imag);
        }
        throw new IllegalArgumentException("Obiectul nu este de tipul Complex");
    }

    @Override
    public Object scade(Object obj){

        if(obj instanceof Complex){

            Complex complex = (Complex) obj;
            return new Complex(this.real - complex.real, this.imag - complex.imag);
        }
        throw new IllegalArgumentException("Obiectul nu este de tipul Complex");
    }

    @Override
    public Object inmulteste(Object obj){

        if(obj instanceof Complex){

            Complex complex = (Complex) obj;
            double newReal = (this.real * complex.real) - this.imag * complex.imag;
            double newImag = (this.real * complex.imag) + (this.imag * complex.real);
            return new Complex(newReal, newImag);
        }
        throw new IllegalArgumentException("Obiectul nu este de tipul Complex");
    }

    @Override
    public String toString(){

        if(imag == 0) return String.valueOf(real);
        if(imag > 0) return this.real + "+" + this.imag + "i";
        return this.real + this.imag + "i" ;
    }

}
