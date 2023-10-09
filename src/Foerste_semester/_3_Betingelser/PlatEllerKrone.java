package Foerste_semester._3_Betingelser;

import java.util.Random;

public class PlatEllerKrone {
    public static void main(String[] args) {
        Random gen=new Random();
        int tal=gen.nextInt(2);
        System.out.println("tal = "+tal);

        if (tal==0) {
            System.out.println("Plat");
            System.out.println("Tillykke du vandt");
        }
        else {
            System.out.println("Krone");
            System.out.println("Desværre du tabte");
        }
        System.out.println("Tak for i dag");
    }
}
