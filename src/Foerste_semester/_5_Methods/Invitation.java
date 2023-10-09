package Foerste_semester._5_Methods;

public class Invitation {
    public static void main(String[] args) {
        printInvitation("Ole", "Fodbold");
        printInvitation("Pia", "Kage");
        printInvitation("Ulla", "PS5");
    }

    static void printInvitation(String name, String gave){
        System.out.println("Kære "+name);
        System.out.println("Det ville glæde mig meget at se dig til min fødselsdag");
        System.out.println("Onsdag d. 4/6 kl. 14:00");
        System.out.println("Venlig hilsen");
        System.out.println("Bjørn");
        System.out.println("PS: medbring "+gave);
        System.out.println();
    }
}
