package lab8.ex2;

public class Fractie implements Numeric{

    private int numarator;
    private int numitor;

    public Fractie(int numarator, int numitor){
        this.numarator = numarator;
        this.numitor = numitor;
    }

    public int getNumarator(){
        return numarator;
    }
    public int getNumitor(){
        return numitor;
    }

    public void setNumarator(int numarator){
        this.numarator = numarator;
    }
    public void setNumitor(int numitor){
        if(numitor == 0){
            throw new IllegalArgumentException("Numitorul nu poate fi 0");
        }
        this.numitor = numitor;
    }

    private static int cmmdc(int a, int b){

        int r;
        while(b != 0){
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    private Fractie simplifica(){

        int modulNumarator = Math.abs(numarator);
        int modulNumitor = Math.abs(numitor);
        int divi = cmmdc(modulNumarator, modulNumitor);

        int nouNumarator = numarator / divi;
        int nouNumitor = numitor / divi;

        return new Fractie(nouNumarator, nouNumitor);
    }

    @Override
    public Object aduna(Object obj){
        if(obj instanceof Fractie){
            Fractie frac = (Fractie) obj;

            int numaratorNou = this.numarator * frac.numitor + frac.numarator * this.numitor;
            int numitorNou = this.numitor * frac.numitor;
            return new Fractie(numaratorNou, numitorNou).simplifica();
        }
        throw new IllegalArgumentException("Obiectul nu e de tip Fractie");
    }

    @Override
    public Object scade(Object obj){
        if(obj instanceof Fractie){
            Fractie frac = (Fractie) obj;

            int numaratorNou = this.numarator * frac.numitor -  frac.numarator * this.numitor;
            int numitorNou = this.numitor * frac.numitor;
            return new Fractie(numaratorNou, numitorNou).simplifica();
        }
        throw new IllegalArgumentException("Obiectul nu e de tip Fractie");
    }

    @Override
    public Object inmulteste(Object obj){
        if(obj instanceof Fractie){
            Fractie frac = (Fractie) obj;

            int numaratorNou = this.numarator * frac.numarator;
            int numitorNou = this.numitor * frac.numitor;
            return new Fractie(numaratorNou, numitorNou).simplifica();
        }
        throw new IllegalArgumentException("Obiectul nu e de tip Fractie");
    }

    @Override
    public String toString(){
        if(numitor == 1) return String.valueOf(numarator);
        else return  numarator + "/" + numitor;
    }


}
