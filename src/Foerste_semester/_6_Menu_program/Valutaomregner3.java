package Foerste_semester._6_Menu_program;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Valutaomregner3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double indtastKroner=0;
        int indtastValuta;
        double svenske;
        double kursSvenske = 0.62;
        double norske;
        double kursNorske = 0.65;
        double finske;
        double kursFinske = 7.4;
        double islandske;
        double kursIslandske = 0.05;
        double tilUdbetaling;
        String valutaBogstav="";
        String valutaType;

        System.out.println("Velkommen til Valuta omregner");
        System.out.println("Her kan du veksle fra danske kroner til svenske, norske, finske eller islandske kroner.");

        while (true) {
            System.out.print("Indtast beløb i danske kroner (tast 0 for at afslutte programmet): ");

            indtastKroner=input.nextDouble();
            if (indtastKroner == 0) break;
            System.out.println("Tast 1 for svenske kroner");
            System.out.println("Tast 2 for norske kroner");
            System.out.println("Tast 3 for finske mark (EUR)");
            System.out.println("Tast 4 for islandske kroner");
            System.out.print("Indtast valuta: ");
            indtastValuta=input.nextInt();

           switch (indtastValuta){
                case 1:
                    tilUdbetaling=indtastKroner/kursSvenske;
                    valutaType = "SEK";
                    break;
                case 2:
                    tilUdbetaling=indtastKroner/kursNorske;
                    valutaType = "NOK";
                    break;
                case 3:
                    tilUdbetaling=indtastKroner/kursFinske;
                    valutaType = "EUR";
                    break;
                case 4:
                    tilUdbetaling=indtastKroner/kursIslandske;
                    valutaType = "ISK";
                    break;
                default:
                    System.out.println("Ugyldig valuta");
                    System.out.println();
                    continue;
            }
            System.out.println("Til udbetaling: " +tilUdbetaling+""+valutaBogstav+" "+valutaType);
            System.out.println();
        } // while
        System.out.println("Programmet lukkes.");
    } // main

    static double inputDouble(String prompt) {
    Scanner input = new Scanner(System.in);
    boolean OK = false;
    double indtastValuta = 0;
    do {
        try {
            System.out.print(prompt);
            indtastValuta = input.nextDouble();
            OK = true;
        } catch (InputMismatchException e) {
            System.out.println("Ulovligt input. Prøv igen");
            input.nextLine();
        }
    } while (!OK);
    return indtastValuta;
    }
} // class Valutaomregner
