package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork07 {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		HomeWork07 obj = new HomeWork07();
//		obj.process1();
		obj.process2();
	}
	private void process2() {
		/*
		 * 거스름돈을 올바르게 주는 프로그램
		 * 75550 ->  만원 7개, 5천 1개, 500 1개 50 1개0
		 */
		int money = 75550;
		int[] coin = {10000,5000,1000,500,50,10};
		for (int i = 0; i < coin.length; i++) {
			int count = money/coin[i];
			if(count==0)continue;
			money = money%coin[i];
			System.out.print(coin[i]+" "+count+"개\t");
		}
		
		
		
	}
	private void process1() {
		/*
		 * 5개의 단어가 제공되며 이중 임의의 단어가 선택된다.
		 * 선택된 단어의 철자를 섞어 사용자에게 제시하며
		 * 사용자는 이를 보고 원래의 단어를 입력한다
		 * 사용자가 단어를 맞출때 까지 반복하여 단어를 맞추었을때
		 * 시도 횟수 출력.
		 */

		String[] words = {"apple", "banana","love","hope","persimmon"};
		int ran = (int)(Math.random()*words.length);
		//words 배열중에 랜덤한 값을 뽑기
		String word = words[ran];
		
		//문자열 -> char 배열로 전환
		//toCharArray
		char[] ch = word.toCharArray();
		
		int cnt = 0;

		while(true) {
		
		for (int i = 0; i <10000; i++) {
			int cRan = (int)(Math.random()*ch.length);
			char temp = ch[cRan];
			ch[cRan] = ch[0];
			ch[0] = temp;
		}
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
		
		System.out.println("\t단어를 맞추세요");
		String word1 = sc.next();
		
		int count = ++cnt;
		//문자열 비교에는 equals 사용
		if(word.equals(word1)) {
			System.out.print("정답입니다!\t"+"시도횟수 : "+count);
			break;
		}
	}
 }

}
