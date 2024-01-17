package kr.or.ddit.study04;

import java.util.Scanner;


public class ForExample02 {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		ForExample02 obj = new ForExample02();
//		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
		obj.method5();

	}
	private void method5() {
		/*
		 * 홀수만 출력해보기
		 */
		for(int i =1; i<20; i++) {
			if(i%2==0) {
				continue; //만나는 순간 다음 루프로 넘어감
			}
			System.out.println(i);
		}
		
//		for(int i =1; i<20; i++) {
//			if(i%2==1) {
//				System.out.println(i);
//			}
//		}
		
	}
	
	private void method4() {
		/*
		 * 전체구구단 출력
		 */
		
		for(int dan =2; dan<=9; dan++) {
			System.out.println("---------"+dan+"단---------");
			for(int j =1; j<=9; j++) {
				System.out.println(dan+"*"+ j +"+"+dan*j);
			}
	 }

	}
	private void method3() {
		/*
		 * 입력받은 숫자로 
		 * 구구단을 만드시오
		 * 
		 * ex)3*1 = 3
		 * 	  3*2
		 * 		:
		 * 	  3*9 = 27
		 */
		System.out.println("출력할 구구단의 단을 입력하세요.");
		int dan = sc.nextInt();
		for(int i =1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
		}
		

	}
	private void method2() {
		//
		for(int i =0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
	private void method1() {
		/*
		 * 영어를 입력한 후 영어에 포함된 모음의 개수를 구해보시오
		 * a e i o u
		 */
		System.out.println("영어를 입력하세요.");
		String str = sc.next();
		
		//문자열의 길이
		int length = str.length();
		
		int cnt = 0;
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u') {
				cnt++;
			}
			System.out.println("모음의 개수는: "+cnt);
		}
		//모음의 개수 
		
	} 
}

