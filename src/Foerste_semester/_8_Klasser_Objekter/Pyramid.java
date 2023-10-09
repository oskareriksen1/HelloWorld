package Foerste_semester._8_Klasser_Objekter;

public class Pyramid {
    public static void main(String[] args) {
        pyramide P1 = new pyramide(9, 7);
        pyramide P2 = new pyramide(10, 5);
        pyramide P3 = new pyramide(6, 2);
        pyramide P4 = new pyramide(10,8);

        System.out.println(P1);
        System.out.println(P2);
        System.out.println(P3);
        System.out.println(P4);
    }
}
class pyramide {
    int side;
    double height;
    double volume;

    pyramide(int s, double h) {  //constructor
        side = s;
        height = h;
        volume = s * s * h / 4;
    }

    @Override
    public String toString() {
        return "Hvis pyramidens sider er " + side + " og højden er " + height + " så må volumen i pyramiden være " + volume;
    }
}