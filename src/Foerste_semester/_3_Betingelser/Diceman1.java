package Foerste_semester._3_Betingelser;

import javax.swing.*;
import java.util.Random;

public class Diceman1 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Click OK to roll the dice");
        Random gen=new Random();
        int dice= gen.nextInt(6)+1;      // [1, 6]
        String activity="";

        System.out.println("Diceman 1");
        switch (dice) {
            case 1 -> activity = ("Breakfast");
            case 2 -> activity = ("call mom");
            case 3 -> activity = ("Go fishing");
            case 4 -> activity = ("Study");
            case 5 -> activity = ("Run");
            case 6 -> activity = ("Go back to bed");
        }

        System.out.println(activity);
        System.out.println("Goodbye");
    }
}
