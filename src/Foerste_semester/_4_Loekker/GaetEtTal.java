package Foerste_semester._4_Loekker;

import java.util.Random;
import java.util.Scanner;

public class GaetEtTal {
    public static void main(String[] args) {
        Random rng = new Random();
        int number = rng.nextInt(20)+1;
        int guess;

        Scanner scanner = new Scanner(System.in);
        //System.out.println("Tallet er: " + tal);

        while (true) {
            System.out.println("Input number: \n");
            guess = scanner.nextInt();
            if (number == guess) {
                System.out.println("Correct!");
                break;
            } else if (number < guess) {
                System.out.println("The number is lower, try again");
            } else {
                System.out.println("The number is higher, try again");
            }
        }
    }
}
