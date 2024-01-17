package kr.or.ddit.homework;

import java.util.Scanner;

import kr.or.ddit.study04.WhileExample;

public class HomeWork06 {
Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		HomeWork06 obj = new HomeWork06();

//		obj.method1();
//		obj.method2();
		obj.method3();


	}
	public void method1() {
		/*
		 * 전체 구구단을 출력하시오
		 * 2*1=1 3*1=3 .........9*1=9
		 * :
		 * 
		 * 
		 * 2*9=18...............9*9=81
		 */
		for(int j =1; j<=9; j++) {
			
			for(int dan =2; dan<=9; dan++) {
				System.out.print(dan+"*"+ j +"="+dan*j+"\t");
			}
			System.out.println();
	 }

		
	}
	public void method2() {
		/*
		 * 전체 구구단을 출력하는데 
		 * 입력받은 구구단은 제외하고 출력
		 * 예) 3을 입력 -> 3단 제외한 전체 구구단 출력
		 */
		System.out.println("입력한 단을 제외하고 출력합니다.");
		int dan = sc.nextInt();
		
		for(int i =1; i<=9; i++) {
		System.out.println();
			 for (int num=2; num<=9; num++) {
				 if(num==dan) {
					 continue;
				 }
				 System.out.printf("%d * %d = %d   ", num, i, num*i);
			 }
			
		}


	}
	public void method3() {
		/*
		 * 입력받은 값이 양의 정수라면
		 * 1.홀수라면
		 * n이하의 홀수인 모든 양의 정수 총합.
		 * ex) 1+3+5
		 * 2.짝수라면
		 * n이하의 모든 짝수의 제곱 총합
		 * ex) 2*2+4*4+6*6
		 */
		System.out.println("정수를 입력하세요.");
		int num = sc.nextInt();
		int sum = 0;
		
		if(num%2==1) {
			for(int i =1; i<=num; i+=2) {
				sum+= i;
			}
			System.out.println("홀수 총합 : "+sum);
			
		}
		if(num%2==0) {
			for(int i =2; i<=num; i+=2) {
				sum+= i*i;
			}
			System.out.println("짝수 총합 : "+sum);
			
		}
	
	}
}
