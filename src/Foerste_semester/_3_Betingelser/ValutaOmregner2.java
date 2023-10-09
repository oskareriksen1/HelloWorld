package Foerste_semester._3_Betingelser;

public class ValutaOmregner2 {
    public static void main(String[] args) {
        double kurs = 0.95;

        double dollars = 300;

        double kommision = dollars*0.02;
        if (kommision >= 0.5);

        double euro = dollars*kurs;
        euro -= kommision;

        System.out.println("Beløb i euro efter kommission: " +euro);
    }
}
