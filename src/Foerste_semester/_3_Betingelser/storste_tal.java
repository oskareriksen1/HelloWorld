package Foerste_semester._3_Betingelser;

public class storste_tal {
    public static void main(String[] args) {
        System.out.println("Indtast første tal");
        java.util.Scanner tastatur= new java.util.Scanner(System.in);
        double tal1;
        double stortal;
        double lilletal;
        tal1= tastatur.nextInt();

        if (tal1>=0) {
            System.out.println("Indtast nr 2 tal");
            double tal2;
            tal2= tastatur.nextInt();

            if (tal2>=0) {
                System.out.println("Indtast nr 3 tal");
                double tal3;
                tal3= tastatur.nextInt();

                if (tal3>=0) {
                 if (tal1>tal2 && tal1>tal3) stortal=tal1;
                 else if (tal2>tal1 && tal2>tal3) stortal=tal2;
                 else stortal=tal3;

                 if (tal1<tal2 && tal1<tal3) lilletal=tal1;
                 else if (tal2<tal1 && tal2<tal3) lilletal=tal2;
                 else lilletal=tal3;

                 if (lilletal>=0 && stortal>=0) System.out.println(lilletal+" er det mindste tal og "+stortal+" er det største tal");
        }

    }
}
}
}