package lab8.ex2;

public class Main {

    public static void main(String[] args) {

        Matrice matA_F = new Matrice(2, 2);
        matA_F.setElement(0, 0, new Fractie(1, 2));
        matA_F.setElement(0, 1, new Fractie(3, 1));
        matA_F.setElement(1, 0, new Fractie(0, 1));
        matA_F.setElement(1, 1, new Fractie(1, 3));
        System.out.println("Matricea A:");
        matA_F.afiseaza();

        Matrice matB_F = new Matrice(2, 2);
        matB_F.setElement(0, 0, new Fractie(1, 1));
        matB_F.setElement(0, 1, new Fractie(-1, 2));
        matB_F.setElement(1, 0, new Fractie(3, 5));
        matB_F.setElement(1, 1, new Fractie(2, 3));
        System.out.println("\nMatricea B:");
        matB_F.afiseaza();

        Matrice matC_F = (Matrice) matA_F.aduna(matB_F);
        System.out.println("\nRezultat Adunare (A + B):");
        matC_F.afiseaza();

        Matrice matD_F = (Matrice) matA_F.scade(matB_F);
        System.out.println("\nRezultat Scadere (A - B):");
        matD_F.afiseaza();

        Numeric scalar_F = new Fractie(2, 1);
        Matrice matE_F = (Matrice) matA_F.inmulScalar(scalar_F);
        System.out.println("\nRezultat Inmultire cu Scalar (A * 2/1):");
        matE_F.afiseaza();

        Matrice matF_F = (Matrice) matA_F.inmulteste(matB_F);
        System.out.println("\nRezultat Inmultire Matrice (A * B):");
        matF_F.afiseaza();

        System.out.println("\n");

        Matrice matX_C = new Matrice(2, 2);
        matX_C.setElement(0, 0, new Complex(1.0, 1.0));
        matX_C.setElement(0, 1, new Complex(0.0, 2.0));
        matX_C.setElement(1, 0, new Complex(3.0, 0.0));
        matX_C.setElement(1, 1, new Complex(-1.0, 1.0));
        System.out.println("Matricea X:");
        matX_C.afiseaza();

        Matrice matY_C = new Matrice(2, 2);
        matY_C.setElement(0, 0, new Complex(2.0, -1.0));
        matY_C.setElement(0, 1, new Complex(0.0, 0.0));
        matY_C.setElement(1, 0, new Complex(1.0, 1.0));
        matY_C.setElement(1, 1, new Complex(0.0, 3.0));
        System.out.println("\nMatricea Y:");
        matY_C.afiseaza();


        Matrice matZ_C = (Matrice) matX_C.aduna(matY_C);
        System.out.println("\nRezultat Adunare (X + Y):");
        matZ_C.afiseaza();


        Numeric scalar_C = new Complex(1.0, 1.0);
        Matrice matW_C = (Matrice) matX_C.inmulScalar(scalar_C);
        System.out.println("\nRezultat Inmultire cu Scalar (X * 1+1i):");
        matW_C.afiseaza();


    }
}