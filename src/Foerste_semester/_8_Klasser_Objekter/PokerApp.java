package Foerste_semester._8_Klasser_Objekter;// Opgaver.PokerApp. Opgave
// Bj�rn Christensen, 11/9-2020

import java.util.ArrayList;
import java.util.Collections;

public class PokerApp {

	public static void main(String[] args) {
		ArrayList<Card> deck=new ArrayList<Card>();
		for (int i=1; i<=13; i++) {
			deck.add(new Card("Hjerter", i));
			deck.add(new Card("Kl�r", i));
			deck.add(new Card("Spar", i));
			deck.add(new Card("Ruder", i));
		}
		Collections.shuffle(deck);
//		System.out.println(deck);
		
		PokerPlayer p1=new PokerPlayer("Joe");
		PokerPlayer p2=new PokerPlayer("Jill");
		for (int i=0; i<5; i++) {
			p1.list.add(deck.remove(0));												// first card
			p2.list.add(deck.remove(0));												// next card
		}

		System.out.println(p1);
		System.out.println(p1.highestCard());
		System.out.println("noOfSpades: "+p1.noOfSpades());
		System.out.println("noOfSuit(Spar): "+p1.noOfSuit("Spar"));
		System.out.println("noOfSuit(Ruder): "+p1.noOfSuit("Ruder"));
		System.out.println("noOfSuit(Kl�r): "+p1.noOfSuit("Kl�r"));
		System.out.println("noOfSuit(Hjerter): "+p1.noOfSuit("Hjerter"));
		System.out.println(p1.flush());
		System.out.println(p1.straight());
	}
}

class PokerPlayer {
	String name;
	ArrayList<Card> list=new ArrayList<Card>();
	
	PokerPlayer(String n){
		name=n;
	}

	public String toString() {
		return name+list;
	}

	Card highestCard() {
		Card max=list.get(0);
		for (Card c:list) {
			if (c.rank>max.rank) 
				max=c;
		}
		return max;
	}
	
	int noOfSpades() {
		int n=0;
		for (Card c:list)
			if (c.suit.equals("Spar")) n++;
		return n;
	}

	int noOfSuit(String suit) {
		int n=0;
		for (Card c:list)
			if (c.suit.equals(suit)) n++;
		return n;
	}

	boolean flush() {
		if (noOfSuit("Spar")==5) return true;
		if (noOfSuit("Ruder")==5) return true;
		if (noOfSuit("Kl�r")==5) return true;
		if (noOfSuit("Hjerter")==5) return true;
		return false;
	}

	boolean straight() {
		if (list.size()<5) return false;		// check precondition
		list.sort(null);
		if ((list.get(0).rank+1==list.get(1).rank) &&
				(list.get(1).rank+1==list.get(2).rank) &&
				(list.get(2).rank+1==list.get(3).rank) &&
				(list.get(3).rank+1==list.get(4).rank))
			return true;
		else
			return false;
	}
	
	boolean straight_flush() {
		return (straight() && flush());
	}
}

class Card implements Comparable<Card> {
	String suit;
	int rank;
	
	Card(String s, int r){
		suit=s;
		rank=r;
	}
	
	public String toString() {
		return suit+"-"+rank;
	}

	public int compareTo(Card c) {
		return rank-c.rank;
	}
}