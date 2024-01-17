package kr.or.ddit.study04;

import java.util.Scanner;

public class ForExample {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		ForExample obj = new ForExample();
//		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
//		obj.method5();
		obj.method6();
		
	}
	private void method6() {
		// 내가 입력한 알파벳으로 부터 z까지 출력
		//chatAt 활용
		System.out.println("알파벳을 입력하세요.");
		String str = sc.next();
		char ch = str.charAt(0); 
		for (; ch<='z'; ch++) {
			System.out.print(ch);
		}
		

	}
	private void method5() {
		// a 부터 z까지 출력
		//a 라는 char를 1더해줘서 출력해야함 
		//char도 for문 실행 가능
		char ch ='a';
		for(char c='a'; c<='z'; c++) {
			System.out.print(c);
		}
		
		 for(int i=0; i<'z'-'a'; i++) {
	         char ch2= (char)(ch+i);
	         System.out.println(ch2);
	      }
		

	}
	private void method4() {
		//1~10 까지의 홀수의 합을 구하시오
		// 홀수    a%2==1, 짝수 a%2==0
		//두번째 는 for문만 사용해서 
		
		int sum = 0;
//		for (int i=1; i<=10; i++) {
//			if(i%2==1){
//				sum+=i;
//			}
//		}
		
		for(int i=1; i<=10; i=i+2) {
			sum+=i;
		}
		System.out.println("1~10까지의 홀수의 합은"+sum);

		//1~10 까지의 짝수의 합을 구하시오.
		int sum2 = 0;
//		for (int i=1; i<=10; i++) {
//			if(i%2==0){
//				sum2+=i;
//			}
//		}
		for(int i=2; i<=10; i+=2) {
			sum2+=i;
		}
		System.out.println("1~10까지의 짝수의 합은"+sum2);
		

	}
	private void method3() {
		//10~20 까지의 합
		int sum = 0;
		
		for (int i=10; i<=20; i++) {
			sum+=i;
			System.out.println("i :"+i+", sum:" +sum);
		}
		System.out.println("10~20까지의 합은"+sum);
		

	}
	private void method2() {
		// 1~20까지의 합을 구하시오
		
		int sum = 0;
	
		//참이면 계속 실행 된다.
		for(int i=0; i<=20; i++) {
			sum+=i;
			System.out.println("i :"+i+", sum:" +sum);
		}
		System.out.println("1~20까지의 합은"+sum);
	}
	
	private void method1() {
		/*
		 * 1~10까지의 합을 더하시오 
		 *
		 */
		int cnt =1;
		
//		sum +=cnt++;
//		sum +=cnt++;
//		sum +=cnt++;
//		sum +=cnt++;
//		sum +=cnt++;
//		sum +=cnt++;
//		sum +=cnt++;
//		sum +=cnt++;
//		sum +=cnt++;
//		sum +=cnt++;
//		sum +=cnt++;
		
		/*
		 * 반복문 for, while 문
		 * for(int i=1; i<=10, i++)
		 * 
		 * int i=1	<-초기화식 (어떤값으로 시작할건지 설정)
		 * i<10	<-조건식(종료조건)
		 * i++	<-증강식(반복시 실행)
		 */
		
		
		int sum = 0;
		//참이면 계속 실행 된다.
		for(int i=0; i<10; i++) {
			sum+=i;
			System.out.println("i :"+i+", sum:" +sum);
		}
		System.out.println("1~10까지의 합은"+sum);
		

	}

}
