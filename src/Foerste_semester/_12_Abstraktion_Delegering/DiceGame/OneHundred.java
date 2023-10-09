package Foerste_semester._12_Abstraktion_Delegering.DiceGame;

public class OneHundred {
    Player p1=new Player("Bjarke");
    Player p2=new Player("Martin");
    Player p3=new Player("Svend");

    void play() {
        int i=1;
        System.out.println("Turn"+"\t"+p1.name+" "+p2.name+" "+p3.name);
        while (p1.points < 100 && p2.points < 100 && p3.points <100) {
            p1.turn();
            p2.turn();
            p3.turn();
            System.out.println(i+"\t\t"+p1.points +"\t\t" + p2.points +"\t\t"+ p3.points);
            i++;

        }
        if (p1.points<p2.points && p2.points >p3.points) System.out.println("The winner is "+p2.name);
        else if (p2.points<p1.points && p1.points >p3.points) System.out.println("The winner is "+p1.name);
        else if (p3.points>p1.points && p3.points>p2.points) System.out.println("The winner is "+p3.name);

        else if(p3.points==p1.points) System.out.println("IT is a tie between "+p1.name+ "and "+p3.name);
        else if (p3.points==p2.points) System.out.println("It is a tie between "+p2.name+ "and "+p3.name);
        else if (p1.points==p2.points) System.out.println("It is a tie between "+p1.name + "and "+p2.name);
        else if (p1.points==p2.points && p1.points==p3.points) System.out.println("It is a tie between all players");
    }

        public static void main(String[] args) {
        OneHundred game=new OneHundred();
        game.play();
    }
}

