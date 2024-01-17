package kr.or.ddit.homework;

import java.util.Random;

public class HomeWork14 {
	public static void main(String[] args) {
		Deck deck = new Deck();
		Card[] cardList = deck.cardList();
		deck.shuffle(cardList);
		deck.print(cardList);
		boolean win = deck.win(cardList);
		if(win) System.out.println("당신이 이겼습니다.");
		else System.out.println("당신이 졌습니다.");
	}
}
class Card{
	String type;
	int num;
	public Card(String type, int num) {
		this.type = type;
		this.num = num;
	}
	@Override
	public String toString() {
		String n = "";
		if(num==1) n="A";
		else if(num==10) n="T";
		else if(num==11) n="J";
		else if(num==12) n="Q";
		else if(num==13) n="K";
		else n+=num;
		return type+n;
	}
}

class Deck{
	public Card[] cardList() {
		Card[] cardList = new Card[52];
		for(int i=1; i<=52; i++) {
			int num = i%13;
			if(num==0) num =13;
			String type = "";
			if((i-1)/13 ==0) type="♠"; 
			if((i-1)/13 ==1) type="◈"; 
			if((i-1)/13 ==2) type="♥"; 
			if((i-1)/13 ==3) type="♣"; 
			cardList[i-1] = new Card(type, num);
		}
		return cardList;
	}
	
	public void print(Card[] cardList) {
		for (Card card : cardList) {
			System.out.println(card);
		}
	}
	
	public void shuffle(Card[] cardList) {
		for (int i = 0; i < 1000; i++) {
			int ran = new Random().nextInt(52);
			Card temp = cardList[0];
			cardList[0] = cardList[ran];
			cardList[ran] = temp;
		}
	}
	
	public boolean win(Card[] cardList) {
		// 카드 숫자가 내 카드가 높다면 win -> true 
		// 작거다 같다면 lose -> false
		
		Card user = cardList[0];
		int ran = new Random().nextInt(51)+1;
		Card com = cardList[ran];
		System.out.println("USER : "+user);
		System.out.println("COM : "+com);
		if(com.num < user.num) return true; 
		return false;
	}
	
	
}