package Foerste_semester._5_Methods;

public class CopenhagenMarathon {
    public static void main(String[] args) {
        CopenhagenMarathon("Peter Adams", 1556, 'D');
        CopenhagenMarathon("Omar Farooq", 1699, 'D');
        CopenhagenMarathon("Lotte Nybo", 843, 'B');
    }
        static void CopenhagenMarathon(String name, int startNumber, char group){
        System.out.println("Dear "+name+" !");
        System.out.println("We are happy to receive your registration.");
        System.out.println("Your start number is: "+startNumber);
        System.out.println("You start in start group: "+group);
        System.out.println("Please check in 10 minutes before start.");
            System.out.println();
    }
}
