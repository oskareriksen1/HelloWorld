package SystemUdvikling;

import java.util.ArrayList;
import java.util.Scanner;

public class Opskriftsbog1 {
    public static void main(String[] args) {

    }
    static class Opskrift {
        private String titel;
        private String ingredienser;
        private String fremgangsmaade;
        private String kategori;
        private int stjerner;
        private ArrayList<String> kommentarer;

        public Opskrift(String titel, String ingredienser, String fremgangsmaade, String kategori) {
            this.titel = titel;
            this.ingredienser = ingredienser;
            this.fremgangsmaade = fremgangsmaade;
            this.kategori = kategori;
            this.stjerner = 0; // Start med ingen stjerner
            this.kommentarer = new ArrayList<>();
        }

        // Metode til at tilføje en kommentar til opskriften
        public void tilfojKommentar(String kommentar) {
            kommentarer.add(kommentar);
        }

        // Metode til at vurdere opskriften med stjerner
        public void vurderOpskrift(int stjerner) {
            this.stjerner = stjerner;
        }

        // Metoder til at få opskriftsoplysninger
        public String getTitel() {
            return titel;
        }

        public String getIngredienser() {
            return ingredienser;
        }

        public String getFremgangsmaade() {
            return fremgangsmaade;
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

        public class DigitalOpskriftsbog {
            private static ArrayList<Opskrift> opskrifter = new ArrayList<>();
            private static Scanner scanner = new Scanner(System.in);

            public static void main(String[] args) {
                while (true) {
                    System.out.println("Velkommen til Digital Opskriftsbog!");
                    System.out.println("1. Tilføj en opskrift");
                    System.out.println("2. Søg efter opskrift");
                    System.out.println("3. Lav indkøbsliste");
                    System.out.println("4. Afslut");

                    int valg = scanner.nextInt();

                    switch (valg) {
                        case 1:
                            tilfojOpskrift();
                            break;
                        case 2:
                            sogOpskrift();
                            break;
                        case 3:
                            lavIndkobsliste();
                            break;
                        case 4:
                            System.out.println("Farvel!");
                            System.exit(0);
                        default:
                            System.out.println("Ugyldigt valg. Prøv igen.");
                    }
                }
            }

            private static void tilfojOpskrift() {
                scanner.nextLine(); // Ryd buffer
                System.out.print("Indtast opskriftens titel: ");
                String titel = scanner.nextLine();
                System.out.print("Indtast ingredienser: ");
                String ingredienser = scanner.nextLine();
                System.out.print("Indtast fremgangsmåde: ");
                String fremgangsmaade = scanner.nextLine();
                System.out.print("Indtast kategori: ");
                String kategori = scanner.nextLine();

                Opskrift opskrift = new Opskrift(titel, ingredienser, fremgangsmaade, kategori);
                opskrifter.add(opskrift);
                System.out.println("Opskrift tilføjet!");
            }

            private static void sogOpskrift() {
                scanner.nextLine(); // Ryd buffer
                System.out.print("Søg efter opskrift ved titel eller ingrediens: ");
                String sogetekst = scanner.nextLine();

                for (Opskrift opskrift : opskrifter) {
                    if (opskrift.getTitel().toLowerCase().contains(sogetekst.toLowerCase()) ||
                            opskrift.getIngredienser().toLowerCase().contains(sogetekst.toLowerCase())) {
                        System.out.println("Resultat:");
                        System.out.println("Titel: " + opskrift.getTitel());
                        System.out.println("Ingredienser: " + opskrift.getIngredienser());
                        System.out.println("Fremgangsmåde: " + opskrift.getFremgangsmaade());
                        System.out.println("Kategori: " + opskrift.getKategori());
                        System.out.println("Stjerner: " + opskrift.getStjerner());

                        System.out.println("Kommentarer:");
                        for (String kommentar : opskrift.getKommentarer()) {
                            System.out.println("- " + kommentar);
                        }
                    }
                }
            }

            private static void lavIndkobsliste() {
                System.out.println("Lav indkøbsliste for hvilke opskrifter?");
                for (int i = 0; i < opskrifter.size(); i++) {
                    System.out.println(i + 1 + ". " + opskrifter.get(i).getTitel());
                }
                System.out.print("Indtast numre på de valgte opskrifter (adskilt med komma): ");
                scanner.nextLine(); // Ryd buffer
                String valgteOpskrifterInput = scanner.nextLine();
                String[] valgteOpskrifterNumre = valgteOpskrifterInput.split(",");
                ArrayList<Opskrift> valgteOpskrifter = new ArrayList<>();

                for (String nummer : valgteOpskrifterNumre) {
                    int index = Integer.parseInt(nummer.trim()) - 1;
                    if (index >= 0 && index < opskrifter.size()) {
                        valgteOpskrifter.add(opskrifter.get(index));
                    }
                }

                System.out.println("Indkøbsliste:");
                for (Opskrift opskrift : valgteOpskrifter) {
                    String[] ingredienser = opskrift.getIngredienser().split(",");
                    for (String ingrediens : ingredienser) {
                        System.out.println("- " + ingrediens.trim());
                    }
                }
            }
        }
    }
}