package lab9.ex1;

public class Lucrator {

    private String nume;
    private CalendarLucru calendar;

    public Lucrator(String nume, CalendarLucru calendar) {
        this.nume = nume;
        this.calendar = calendar;
    }

    public String getNume() { return nume; }
    public void setNume(String nume) { this.nume = nume; }
    public CalendarLucru getCalendar() { return calendar; }
    public void setCalendar(CalendarLucru calendar) { this.calendar = calendar; }

    public void lucreaza(String zi) throws ExceptieZiNelucratoare{

        boolean potrivireNume = false;

        for(Zi z : calendar.getZile()){
            if(z.getNume().equals(zi)){
                potrivireNume = true;

                if(!z.isLucratoare()) throw new ExceptieZiNelucratoare("Exceptie: lucru in zi nelucratoare");
                else System.out.println("Lucratorul " + this.nume + " lucreaza " + z.getNume());

                return;
            }
        }
        if(!potrivireNume) System.out.println(zi + " nu este o zi a saptamanii");
    }

}
