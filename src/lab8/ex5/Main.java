package lab8.ex5;

public class Main {
    public static void main(String[] args) {

        System.out.println("Shallow Copy: ");
        Masina masinaOriginala = new Masina("Dacia", "Rosu");
        Student studentOriginalS = new Student("Popescu", "Ion", masinaOriginala);

        System.out.println(studentOriginalS);

        try{
            Student studentClonaS = studentOriginalS.shallowClone();
            System.out.println(studentClonaS);

            studentClonaS.getMasina().revopseste("Albastru");
            System.out.println(studentOriginalS);
            System.out.println(studentClonaS);

            if(studentOriginalS.getMasina().getCuloare().equals("Albastru")){
                System.out.println("S-a schimbat si originalul");
            }

        } catch(CloneNotSupportedException e){
            System.out.println("Eroare la clonare");
        }

        System.out.println("\n");
        System.out.println("Deep Copy: ");

        Masina masinaNoua = new Masina("BMW", "Negru");
        Student studentOriginalD = new Student("Ionescu", "Ana", masinaNoua);
        System.out.println(studentOriginalD);

        try{

            Student studentClonaD = studentOriginalD.deepClone();
            System.out.println(studentClonaD);

            studentClonaD.getMasina().revopseste("Alb");
            System.out.println(studentOriginalD);
            System.out.println(studentClonaD);

            if(studentOriginalD.getMasina().getCuloare().equals("Negru")){
                System.out.println("Originalul a ramas neschimbat");
            }
        }
        catch(CloneNotSupportedException e){
            System.out.println("Eroare la clonare");
        }

    }
}
