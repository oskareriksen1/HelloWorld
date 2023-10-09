package SystemUdvikling;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Opskriftsbog {
    public static ArrayList<Opskrift> opskrifter = new ArrayList<>();

    public static void main(String[] args) throws IOException {


        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Velkommen til digital opskriftsbog");
            System.out.println("1. Tilføj en opskrift");
            System.out.println("2. Søg efter opskrift");
            System.out.println("3. Lav indkøbsliste");
            System.out.println("4. Afslut");

            int valg = scanner.nextInt();

            switch (valg) {

                case 1:
                    System.out.println("Tilføj Opskrift");
                    scanner.nextLine(); // Ryd linjeskift i inputbufferen
                    String tilføjOpskrift = scanner.nextLine();

                    break;

                case 2:
                    System.out.println("Søg Opskrift");
                    scanner.nextLine(); // Ryd linjeskift i inputbufferen
                    String SøgOpskrift = scanner.nextLine();
                    break;

                case 3:
                    System.out.println("Lav Indkøbsliste");
                    scanner.nextLine(); // Ryd linjeskift i inputbufferen
                    String LavIndkøbsliste = scanner.nextLine();
                    break;

                case 4:
                    System.out.println("Farvel!");
                    System.exit(0);

                default:
                    System.out.println("Ugyldigt valg. Prøv igen");
            }
        }
    }
}
class Opskrift {
    private static String titel;
    private String ingredienser;
    private String fremgangsmåde;
    private String kategori;
    private int stjerner;
    private ArrayList<String> kommentarer;

    public Opskrift(String titel, String ingredienser, String fremgangsmåde, String kategori) {
        this.titel = titel;
        this.ingredienser = ingredienser;
        this.fremgangsmåde = fremgangsmåde;
        this.kategori = kategori;
        this.stjerner = 0; // start med ingen stjerner
        this.kommentarer = new ArrayList<>();

    }

    // metode til at tilføje en kommentar til opskriften
    public void tilføjKommentar(String Kommentar) {
        kommentarer.add(Kommentar);
    }

    // metode til at tilføje stjerner til opskriften
    public void vurderOpskrift(int stjerner) {
        this.stjerner = stjerner;
    }

    public static String getTitel() {
        return titel;
    }

    public String getIngredienser() {
        return ingredienser;
    }

    public String getFremgangsmåde() {
        return fremgangsmåde;
    }

    public String getKategori() {
        return kategori;
    }

    public int getStjerner() {
        return stjerner;
    }

    public ArrayList<String> getKommentarer() {
        return kommentarer;
    }

    @Override
    public String toString() {
        return "Opskrift: " + titel + " Ingredienser " + ingredienser + " Fremgangsmåde " + fremgangsmåde + " Kategori " + kategori + " Stjerner " + stjerner;
    }


    private void tilføjEnOpskrift() {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine(); // ryd buffer

        System.out.println("Indtast opskriftens titel");
        String titel = scanner.nextLine();

        System.out.println("Indtast ingredienser");
        String ingredienser = scanner.nextLine();

        System.out.println("Indtast fremgangsmåde");
        String fremgangsmåde = scanner.nextLine();

        System.out.println("Indtast kategori");
        String kategori = scanner.nextLine();

        Opskrift opskrift = new Opskrift(titel, ingredienser, fremgangsmåde, kategori);
        Opskriftsbog.opskrifter.add(opskrift);
        System.out.println("Opskrift tilføjet");
    }

    private static void søgOpskrift() {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine(); // ryd buffer
        System.out.println("Søg efter opskrift ved titel eller ingrediens");
        String søgetekst = scanner.nextLine();

        for (Opskrift opskrift : Opskriftsbog.opskrifter) {
            String titel = Opskrift.getTitel().toLowerCase();
            String ingredienser = opskrift.getIngredienser().toLowerCase();
            søgetekst = søgetekst.toLowerCase();

            if (titel.contains(søgetekst)) {
                System.out.println("Resultat:");
                System.out.println("Titel: " + opskrift.getTitel());
                System.out.println("Ingredienser: " + opskrift.getIngredienser());
                System.out.println("Fremgangsmåde: " + opskrift.getFremgangsmåde());
                System.out.println("Kategori: " + opskrift.getKategori());
                System.out.println("Stjerner " + opskrift.getStjerner());

                System.out.println("Kommentarer");
                for (String kommentar : opskrift.getKommentarer()) ;
                System.out.println("- ");

            }
            if (ingredienser.contains(søgetekst)) {
                System.out.println("Resultat");
                System.out.println("Titel: " + opskrift.getTitel());
                System.out.println("Ingredienser: " + opskrift.getIngredienser());
                System.out.println("Fremgangsmåde: " + opskrift.getFremgangsmåde());
                System.out.println("Kategori: " + opskrift.getKategori());
                System.out.println("Stjerner: " + opskrift.getStjerner());
            }

        }
    }
}

   /* private static void visOpskrifter() {
        if (opskrifter.isEmpty()) {
            System.out.println("Der er ingen opskrifter at vise.\n");
        } else {
            System.out.println("Alle opskrifter:\n");
            for (Opskrift opskrift : opskrifter) {
                System.out.println(opskrift + "\n");
            }
        }
    }
}
   /* private static void lavIndkøbsliste() {
        // Her kan du implementere koden til at oprette en indkøbsliste
        // Dette er et eksempel på, hvordan du kan gøre det:

        ArrayList<String> indkøbsliste = new ArrayList<>();

        // Få brugerens input og tilføj varer til indkøbslisten
        System.out.println("Indtast de varer, du ønsker at tilføje til indkøbslisten (skriv 'afslut' for at afslutte):");

        while (true) {
            String vare = scanner.nextLine();

            if (vare.equalsIgnoreCase("afslut")) {
                break; // Brugeren ønsker at afslutte indtastningen
            }

            indkøbsliste.add(vare);
        }

        // Udskriv indkøbslisten
        System.out.println("Din indkøbsliste:");
        for (String vare : indkøbsliste) {
            System.out.println(vare);
        }
    }


    */
