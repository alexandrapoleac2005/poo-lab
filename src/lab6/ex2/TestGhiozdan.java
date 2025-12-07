package lab6.ex2;

public class TestGhiozdan {
    public static void main(String[] args) {

        Ghiozdan ghiozdan = new Ghiozdan();

        Caiet caiet1 = new Caiet("Caiet de romana");
        Caiet caiet2 = new Caiet("Caiet de matematica");
        Caiet caiet3 = new Caiet("Caiet de biologie");

        Manual manual1 = new Manual("Manual de fizica");
        Manual manual2 = new Manual("Manual de chimie");

        ghiozdan.addCaiet(caiet1);
        ghiozdan.addCaiet(caiet2);
        ghiozdan.addCaiet(caiet3);
        ghiozdan.addManual(manual1);
        ghiozdan.addManual(manual2);
        System.out.println();

        System.out.println("Avem " + ghiozdan.getNrCaiet() + " caiete si " + ghiozdan.getNrManuale() + " manuale.\n" +
                "In total avem " + ghiozdan.getNrRechizite() + " rechizite.");
        System.out.println();
        ghiozdan.listItems();
        System.out.println();
        ghiozdan.listCaiet();
        System.out.println();
        ghiozdan.listManual();

    }
}
