package Foerste_semester._12_Abstraktion_Delegering.DiceGame;

public class Player {
    String name;
    Cup cup=new Cup();
    int points;

    Player(String name){
        this.name=name;
    }

    void turn(){
        cup.roll();
        points=points+cup.getSum();
    }

    public static void main(String[] args) {
        Player p=new Player("Ole");
        while (p.points<100){
            p.turn();
            System.out.println(p.points);
        }
    }
}
