package kr.or.ddit.practice;

import java.util.Scanner;

public class First {
	Scanner sc = new Scanner(System.in); 
	
	public static void main(String[] args) {
		First obj = new First();
		obj.method1();
		
	}
	public void method1(){
		/*
		 * &&, ||, ! 이용 해볼것
		 * 
		 * 윤년 : 4의 배수, 100의 배수x,400의 배수 o
		 * 
		 * 4 8 12 16  윤년
		 * 100 200 300 500 윤년x
		 * 400 800 1200  윤년 // 년도 %4 =0 이면 4의 배수
		 */
		System.out.println("년도를 입력 : ");
		int year = sc.nextInt();
		if(year % 4 == 0 && (year % 100 != 0 && year % 400 == 0)) {
			System.out.println("윤년입니다");
		}
		else {
			System.out.println("평년입니다");
		}
		
	}

}
