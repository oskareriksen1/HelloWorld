package Foerste_semester._10_Nedarving_Polyformi;

public class Polynomier {
    public static void main(String[] args) {
        ForstegradsPolynomium forstegradsPolynomium = new ForstegradsPolynomium(2, 3, 0.2);
        System.out.println(forstegradsPolynomium);
        AndengradsPolynomium andengradsPolynomium = new AndengradsPolynomium(2, 1, 3, 3);
        System.out.println(andengradsPolynomium);
    }
}


abstract class Polynomium {
    abstract double f(double x);
}


class ForstegradsPolynomium extends Polynomium {
    private int a, b;
    private double x;

    public double f(double x) {
        return 3 * x + 2;
    }
    //
    public ForstegradsPolynomium(int a, int b, double x){
        this.a = a;
        this.b = b;
        this.x = x;
    }

    @Override
    public String toString() {
        return "ForstegradsPolynomium:" + " a=" + a + ", b=" + b + ", x=" + x + ", Answer = " + f(x);
    }
}

class AndengradsPolynomium extends Polynomium {
    private int a, b, c;
    private double x;

    public double f(double x) {
        return Math.pow(2 * x, 2) + x + 3; //(2*x)^2
    }
    //
    public AndengradsPolynomium(int a, int b, int c, double x){
        this.a = a;
        this.b = b;
        this.c = c;
        this.x = x;
    }

    @Override
    public String toString() {
        return "AndengradsPolynomium: " + "a=" + a + ", b=" + b + ", c=" + c + ", x=" + x + ", Answer = " + f(x);
    }
}
