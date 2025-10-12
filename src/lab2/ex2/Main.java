public class Main {
    public static void main(String[] args) {

        int i;
        float f;
        double d;
        boolean b;
        char c;


        // parsam sirul pentru fiecare tip de data

        i=Integer.parseInt("123");
        System.out.println(i);

        f=Float.parseFloat("123.45f");
        System.out.println(f);

        d=Double.parseDouble("1.234567");
        System.out.println(d);

        b=Boolean.parseBoolean("true");
        System.out.println(b);

        // cateva exemple pentru clasa Character

        c=Character.toUpperCase('a');
        System.out.println(c);

        c=Character.toLowerCase('A');
        System.out.println(c);

        boolean rez;
        rez=Character.isDigit('a');
        System.out.println(rez);

        rez=Character.isLetter('c');
        System.out.println(rez);

    }
}