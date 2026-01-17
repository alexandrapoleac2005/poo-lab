package lab8.ex5;

public class Student implements Cloneable {

    private String nume;
    private String prenume;
    private Masina masina;

    public Student(String nume, String prenume, Masina masina){
        this.nume = nume;
        this.prenume = prenume;
        this.masina = masina;
    }

    public Masina getMasina(){
        return masina;
    }

    // Shallow Copy
    public Student shallowCopy() throws CloneNotSupportedException {
        return (Student) super.clone();
    }

    // Deep Copy
    public Student deepCopy() throws CloneNotSupportedException {

        Student studentClone = (Student) super.clone();
        studentClone.masina = (Masina) this.masina.clone();
        return studentClone;
    }

    public String toString(){
        return this.nume + " " + this.prenume + " " + this.masina;
    }
}
