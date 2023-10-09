package Foerste_semester._5_Methods;

public class Sum3 {
    private int a = 3;
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = 18;

        double sum;

        sum = plus(a, b, c);
        System.out.println("Summen er "+sum);
    }

    static int plus(int x, int y, int z) {

        int result = x + y + z;
        return result;
    }
}
