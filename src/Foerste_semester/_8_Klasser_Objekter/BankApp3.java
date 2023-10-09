package Foerste_semester._8_Klasser_Objekter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
import java.util.random.RandomGenerator;

public class BankApp3 {
    public static void main(String[] args) {
        Account k1=new Account("Bob", 0.5);
        k1.deposit(100);
        k1.annualInterest();
        System.out.println(k1);

        Account k2=new Indlaan("Jill", 1);
        k2.withdraw(50);
        System.out.println(k2);

        Account k3=new Kredit("John", 0.5, 1000);
        k3.withdraw(800);
        System.out.println(k3);

        Account k4=new HoejrenteKonto("Sue", 5, 2000, 2020, 4, 1);	// Bundet indtil 1/4
        k4.deposit(100);
        k4.withdraw(100);
        k4.annualInterest();
        System.out.println(k4);

        Account k5=new MillionaerKonto("Joe");
        k5.deposit(100);
        k5.annualInterest();
        System.out.println(k5);

        Account k6=new BoerneOpsparing("Sam", 3, 2002, 3, 1);
        k6.deposit(1000);
        k6.withdraw(1000);
        System.out.println(k6);
    }
}

class Indlaan extends Account {
    Indlaan(String ow, double ir){
        super(ow, ir);
    }

    void withdraw(double amount){
        if (balance>=amount) {
            super.withdraw(amount);
        }
        else
            System.out.println("Du kan højst hæve "+balance+" kr.");
    }
}
class Kredit extends Account {
    double creditLimit;				// Er altid negativ

    Kredit(String ow, double rate, double limit) {
        super(ow, rate);
        creditLimit=-limit;
    }

    void withdraw(double amount) {
        if (balance-amount>=creditLimit) {
            super.withdraw(amount);
        } else {
            System.out.println("Overtræk overskredet");
        }
    }

    @Override
    public String toString() {
        return super.toString()+" Kreditmax="+creditLimit;
    }
}
class HoejrenteKonto extends Account {
    LocalDate releaseDate;

    HoejrenteKonto(String ow, double ir, double startBalance, int yy, int mm, int dd) {
        super(ow, ir);
        balance=startBalance;
        releaseDate=LocalDate.of(yy,mm,dd);
    }

    void deposit(double amount) {
        System.out.println("Du kan ikke sætte penge ind på denne konto");
    }

    void withdraw(double amount) {
        if (releaseDate.isAfter(LocalDate.now()))
            System.out.println("Du kan først hæve efter " + releaseDate);
        else
            super.withdraw(amount);
    }
}
class MillionaerKonto extends Account {
    static double jackpot=1000000; // Gevinst: 1.000.000 kr.
    static Random generator = new Random();

    MillionaerKonto(String ow) {
        super(ow, 0);
    }


    void annualInterest() {
        //		int winner=generator.nextInt(100000)+1;					// tal i [1;100000]
        int winner= generator.nextInt(5)+1;                             // tal i [1;100000]
        if (accountNo==winner) deposit(jackpot);
    }
}

class BoerneOpsparing extends Account {
    LocalDate releaseDate;

    BoerneOpsparing(String ow, double rate, int yy, int mm, int dd) {
        super(ow, rate);
        releaseDate=LocalDate.of(yy+18,mm,dd);
    }

    void withdraw(double amount) {
        LocalDate today=LocalDate.now();
        if (today.isBefore(releaseDate)) {
            System.out.println("Saldo bundet indtil "+releaseDate);
        } else {
            super.withdraw(amount);
        }
    }
}
