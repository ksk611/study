package kr.or.ddit.study04;

import java.util.Scanner;

public class WhileExample {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		WhileExample obj = new WhileExample();

//		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
		obj.method5();
	}
	// 변수 수정 단축키 : alt+shift+r
	public void method5() {
		END : while(true) {
			System.out.println("바깥쪽 와일문 실행");
			while(true) {
				System.out.println("안쪽 와일문 실행");
				try {
					Thread.sleep(1500);
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
				break END;
			}
		}
		
	}
	public void method4() {
		int i = 1;
		do {
			System.out.println("실행 됨.");
			i++;
		}
		//do는 한번은 실행이 된다
		while(i<10);
	}
	
	private void method3() {
		int i =2147483647;
		while(i>0) {
			i++;
			System.out.println(i);
		}//int 값 초과 하면 오버플로우 -로 바뀜
		
	}
	private void method2() {
		/*
		 * 커피 매장
		 * 메뉴
		 * 아메리카노:1000
		 * 카페라떼:1500
		 * 자바칩 프라푸치노:2000
		 */
		int sum = 0;
		String bill="***영수증***\n";
		while(true) {
			System.out.println("=====메뉴=====");
			System.out.println("1.아메리카노		:1000");
			System.out.println("2.카페라떼			:1500");
			System.out.println("3.자바칩프라푸치노		:2000");
			System.out.println("4.주문완료.");
			System.out.println("=============");
			int select = sc.nextInt();
			if(select == 1) {
				sum= sum+1000;
				bill+="아메리카노: 1000\n";
			}
			if(select == 2) {
				sum= sum+1500;
				bill+="카페라떼: 1500\n";
			}
			if(select == 3) {
				sum= sum+2000;
				bill+="자바칩프라푸치노: 2000\n";
			}
			if(select == 4) {
				break;
			}
		}
		System.out.println("주문이 완료되었습니다.");
		System.out.println(bill);
		System.out.println("총금액:"+sum);
		
	}
	
		

	private void method1() {
		/*
		 * while 반복문 무한루프 등을 사용할때 주로 사용
		 * 
		 * while(조건식){
		 * 			실행문
		 * 	}
		 */
		
//		int num =0;
//		while(num<10) {
//			System.out.println(num++);
//		}
//		while(true) {
//			System.out.println("실행중");
//		}
		for(;;) {
			System.out.println("실행중");
		}

	}

}
