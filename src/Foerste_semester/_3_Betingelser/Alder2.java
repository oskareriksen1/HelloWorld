package Foerste_semester._3_Betingelser;

public class Alder2
{
    public static void main(String[] args) {
        int alder;
        alder = 15;

        if (alder >= 18) System.out.println("Du må købe spiritus.");
        else if (alder >= 16) System.out.println("Du må købe øl");
        else System.out.println("Drik en sodavand");
        }
    }