package Foerste_semester._7_fil_inputOutput.CphMarathon2;
import java.io.*;

public class CphMarathon2 {
    public static void main(String[] args) throws IOException { //Når vi bruger FileReader, kan der ske fejl... fx hvis filen ikke kan findes, så java kræver at vi skriver, at der kan være en IOExeption (Input-Output-Exception)
        FileReader fil = new FileReader("CopenhagenMarathon.txt"); //vil læse fra filen med path="Copenhagen Marathon.txt". Her er det vigtigt at placere filen det rigtige sted
        BufferedReader ind = new BufferedReader(fil); //Denne bruges til at opfange det, som læses

        String linje = ind.readLine(); //første linje, så vi ikke får en error i while-loopet
        while (linje != null) { //så længe linje har en værdi... ellers er vi jo færdig
            String[] bidder = linje.split(","); //siden dataen er listet således: x,y,z... Så kan vi bruge '.split' til at dele stringen op
            String name = bidder[0]; //0 er første værdig i vores liste af dele af linjen
            int startNo=Integer.parseInt(bidder[1]); //vi laver en string værdi om til et int med Integer.parseInt(String)
            char startGroup=bidder[2].charAt(0); //vi laver et tegn som er lig med første bogstav i 3. værdi af bidder
            saveRegistration(name, startNo, startGroup); //vi kører vores anden metode, der skriver til filen
            linje = ind.readLine(); //nu har vi taget en linje og finder næste... og så fortsætter loopet lidt mere
        }
        ind.close(); //BufferedReader skal lukkes efter man er færdig
    }

    static void saveRegistration(String name, int startNumber, char startGroup) throws IOException {
        //Gemmer filen / skriver
        FileWriter fil = new FileWriter(name+".txt"); //bemærk FileWriter vs FileReader
        PrintWriter ud = new PrintWriter(fil);
        ud.println("Dear "+name+" !"); //læg mærke til, at vi kan erstatte System.out med en PrintWriter
        ud.println("We are happy to receive your registration.");
        ud.println("Your start number is: "+ startNumber);
        ud.println("You start in start group: "+startGroup);
        ud.println("Please check in 10 minutes before start.");
        ud.close(); //PrintWriter skal lukkes efter man er færdig
    }
}
