package lab8.ex2;

public class Fractie implements Numeric{

    private int numarator;
    private int numitor;

    public Fractie(int numarator, int numitor){

        if(numitor == 0) throw new ArithmeticException("Numitorul nu poate fi 0");
        this.numarator = numarator;
        this.numitor = numitor;
    }

    public int getNumarator() {
        return numarator;
    }

    public void setNumarator(int numarator) {
        this.numarator = numarator;
    }

    public int getNumitor() {
        return numitor;
    }

    public void setNumitor(int numitor) {
        if(numitor == 0) throw new ArithmeticException("Numitorul nu poate fi 0");
        this.numitor = numitor;
    }

    private static int cmmdc(int a, int b){

        int r;
        while(b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    @Override
    public Object aduna(Object obj){

        if(obj instanceof Fractie){

            Fractie fractie = (Fractie) obj;
            int newNumarator = this.numarator * fractie.numitor + fractie.numarator * this.numitor;
            int newNumitor = this.numitor * fractie.numitor;
            int divi = Math.abs(cmmdc(newNumarator, newNumitor));

            return new Fractie(newNumarator / divi, newNumitor / divi);
        }
        throw new IllegalArgumentException("Obiectul nu este de tipul Fractie");
    }

    @Override
    public Object scade(Object obj){

        if(obj instanceof Fractie) {

            Fractie fractie = (Fractie) obj;
            int newNumarator = this.numarator * fractie.numitor - fractie.numarator * this.numitor;
            int newNumitor = this.numitor * fractie.numitor;
            int divi = Math.abs(cmmdc(newNumarator, newNumitor));

            return new Fractie(newNumarator / divi, newNumitor / divi);
        }
        throw new IllegalArgumentException("Obiectul nu este de tipul Fractie");
    }

    @Override
    public Object inmulteste(Object obj){

        if(obj instanceof Fractie){

            Fractie fractie = (Fractie) obj;
            int newNumarator = this.numarator * fractie.numarator;
            int newNumitor = this.numitor * fractie.numitor;
            int divi = Math.abs(cmmdc(newNumarator, newNumitor));

            return new Fractie(newNumarator / divi, newNumitor / divi);
        }
        throw new IllegalArgumentException("Obiectul nu este de tipul Fractie");
    }

    @Override
    public String toString(){

        if(numitor == 1) return String.valueOf(numarator);
        return numarator + "/" + numitor;
    }
}
