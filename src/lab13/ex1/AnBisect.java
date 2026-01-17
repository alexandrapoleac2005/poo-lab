package lab13.ex1;

public class AnBisect {

    private int an;

    public boolean esteAnBisect(int an){
        if(an % 4 == 0) {
            if(an % 100 == 0){
                return an % 400 == 0;
            }
            return true;
        }
        return false;
    }
}
