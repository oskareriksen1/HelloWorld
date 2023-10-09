package Foerste_semester._10_Nedarving_Polyformi;

import java.util.ArrayList;

public class FigurApp { // class scope
    public static void main(String[] args) { // main scope
        Figur f1=new Rektangel(4,3);
        Figur f2=new Punkt();

        ArrayList<Figur> list=new ArrayList<Figur>();
        list.add(f1);
        list.add(f2);
        list.add(new Rektangel(2, 5));
        for (Figur f: list){
            System.out.println(f+" omkreds = "+f.beregnOmkreds()+" areal = "+f.beregnAreal());
        }
    } // main scope
} // class scope

abstract class Figur {
    abstract double beregnOmkreds();
    abstract double beregnAreal();
}

class Punkt extends Figur {
    double beregnOmkreds(){ return 0; }
    double beregnAreal(){ return 0; }
    public String toString() { return "Punkt"; }
}

class Rektangel extends Figur {
    double hojde;
    double bredde;

    Rektangel(double h, double b) {
        hojde = h;
        bredde = b;
    }

    double beregnOmkreds() {
        return 2 * (hojde + bredde);
    }

    double beregnAreal() {
        return hojde * bredde;
    }

    public String toString() {
        return "Rektangel h = " + hojde + " b = " + bredde;
    }
}

