package Foerste_semester._4_Loekker;

public class ToTilTiTabellen {
    public static void main(String[] args) {
        int tabel = 2;
        int antalGange = 10;

        while (tabel <= 10) {
            System.out.println("Foerste_semester.Betingelser.Loekker.Multiplikationstabel for " + tabel + ":");

            int i = 1;
            while (i <= antalGange) {
                int resultat = tabel * i;
                System.out.println(tabel + " * " + i + " = " + resultat);
                i++;
            }
            System.out.println();
            tabel++;
        }
    }
}
