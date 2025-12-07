package PARTIAL_lab7;

public class Gradina {

    private int capacitateMaxima;
    private static int numarPlante = 0;
    private Planta[] plante;

    public Gradina (int capacitateMaxima){
        this.capacitateMaxima = capacitateMaxima;
        plante = new Planta[capacitateMaxima];
    }

    public int getCapacitateMaxima() {
        return capacitateMaxima;
    }
    public void setCapacitateMaxima(int capacitateMaxima) {
        this.capacitateMaxima = capacitateMaxima;
    }

    public void adaugaInGradina(Planta planta) {
        if(numarPlante < capacitateMaxima){
            plante[numarPlante] = planta;
            numarPlante++;
        }
        else System.out.println("Gradina este plina!");
    }

    public int  planteCorecte(Planta[] plant){

        int contor = 0;
        for(int i = 0; i<numarPlante; i++){
            Planta planta = plante[i];
            if(planta instanceof Copac){
                Copac copac = (Copac) planta;
                if(copac.getVarsta() <= 50) {
                    contor++;
                }
            }
            else if(planta instanceof Floare){
                Floare floare = (Floare) planta;
                if(floare.getVarsta() <= 10) {
                    contor++;
                }
            }
            else if(planta instanceof Cactus){
                Cactus cactus = (Cactus) planta;
                if(cactus.getVarsta() <= 40) {
                    contor++;
                }
            }

        }
        return contor;
    }
    public void elimina(){

        int contor = 0;
        Planta[] plant = new Planta[planteCorecte(this.plante)];
        for(int i = 0; i<numarPlante; i++){
            Planta planta = plante[i];
            if(planta instanceof Copac){
                Copac copac = (Copac) planta;
                if(copac.getVarsta() <= 50) {
                    contor++;
                    plant[contor] = copac;
                }
            }
            else if(planta instanceof Floare){
               Floare floare = (Floare) planta;
                if(floare.getVarsta() <= 10) {
                    contor++;
                    plant[contor] = floare;
                }
            }
            else if(planta instanceof Cactus){
                Cactus cactus = (Cactus) planta;
                if(cactus.getVarsta() <= 40) {
                    contor++;
                    plant[contor] = cactus;
                }
            }

        }
    }
}
