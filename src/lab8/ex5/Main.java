package lab8.ex5;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Masina masina1 = new Masina("Mercedes", "alb");

        Student student1 = new Student("Poleac", "Alexandra", masina1);

        // Pentru Shallow Copy
        Student studentCopiat1 = student1.shallowCopy();
        studentCopiat1.getMasina().revopseste("rosu");

        System.out.println(student1);
        System.out.println(studentCopiat1);

        masina1.revopseste("negru");

        // Pentru Deep Copy
        Student studentCopiat2 = student1.deepCopy();
        studentCopiat2.getMasina().revopseste("rosu");

        System.out.println(student1);
        System.out.println(studentCopiat2);

    }
}
