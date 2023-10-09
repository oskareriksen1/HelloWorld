package Foerste_semester._3_Betingelser;

public class TreTal {
    public static void main(String[] args) {
        int a, b, c;
        a=3;
        b=5;
        c=9;

        // tjek hvilket tal der er mindst

        if (a < b && a < c)
        {
            System.out.println("a er det mindste tal");
        }
        if (b < a && b < c)
        {
            System.out.println("b er det mindste tal");
        }
        if (c < a && c < b)
        {
            System.out.println("c er det mindste tal");
        }
        // tjek hvilket tal der er størst

        if (a > b && a > c)
        {
            System.out.println("a er det største tal");
        }
        if (b > a && b > c)
        {
            System.out.println("b er det største tal");
        }
        if (c > a && c > b)
        {
            System.out.println("c er det største tal");
        }
    }
}
