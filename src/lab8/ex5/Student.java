package lab8.ex5;

public class Student implements Cloneable{

    private String nume;
    private String prenume;
    private Masina masina;

    public Student(String nume, String prenume, Masina masina) {
        this.nume = nume;
        this.prenume = prenume;
        this.masina = masina;
    }

    public Masina getMasina() {
        return masina;
    }

    @Override
    public String toString() {
        return "Studentul " + nume + " " + prenume + "\n" + masina.toString();
    }
    public Student shallowClone() throws CloneNotSupportedException{
        return (Student) super.clone();
    }

    public Student deepClone() throws CloneNotSupportedException{
        Student clona = (Student) super.clone();
        clona.masina = (Masina) this.masina.clone();
        return clona;
    }

}
