package lab3.ex2;

public class Main {
    public static void main(String[] args) {
        int varsta = 18 , sex = 1 , inaltime = 170;
        short impachetat;

        // impachetare
        impachetat = (short) ((((varsta << 1) | sex) << 8) | inaltime );
        System.out.println("Impachetat:");
        System.out.println(impachetat);

        System.out.println();
        System.out.println("Despachetat:");

        // despachetare
        int inaltime2 = impachetat & 0xff;
        System.out.println(inaltime2);
        int sex2 = (impachetat >>> 8) & 1;
        System.out.println(sex2);
        int varsta2 = (impachetat >>> 9) &0x7f;
        System.out.println(varsta2);

    }
}
