package lab8.ex2;

public class Complex implements Numeric{

    private double real;
    private double imag;

    public Complex(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    public double getReal(){
        return this.real;
    }
    public double getImag(){
        return this.imag;
    }
    public void setReal(double real){
        this.real = real;
    }
    public void setImag(double imag){
        this.imag = imag;
    }

    @Override
    public Object aduna(Object obj){
        if(obj instanceof Complex){
            Complex complex = (Complex) obj;
            return new Complex(this.real + complex.real, this.imag + complex.imag);
        }
        throw new IllegalArgumentException("Obiectul nu e de tip Complex");
    }

    @Override
    public Object scade(Object obj){
        if(obj instanceof Complex){
            Complex complex = (Complex) obj;
            return new Complex(this.real - complex.real, this.imag - complex.imag);
        }
        throw new IllegalArgumentException("Obiectul nu e de tip Complex");
    }

    @Override
    public Object inmulteste(Object obj){
        if(obj instanceof Complex){
            Complex complex = (Complex) obj;
            return new Complex(this.real * complex.real, this.imag * complex.imag);
        }
        throw new IllegalArgumentException("Obiectul nu e de tip Complex");
    }

    @Override
    public String toString(){
        if(imag >= 0) return imag + " + " + real + "i";
        else return  imag + " - " + real + "i";
    }
}
