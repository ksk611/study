package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork04 {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		HomeWork04 obj = new HomeWork04();
		obj.process();
	}
	
	public void process() {
		/*
		 * 가위  바위   보 
		 *  0   1  2
		 * 
		 * 
		 * 0=0 (가위로 비김)
		 * 1=1 (바위로 비김)
		 * 2=2 (보로 비김)
		 * 
		 * ->ran == com
		 * 
		 * 0>2 (가위가 보를 이김) -
		 * 2>1 (보로 바위한테 이김)-
		 * 1>0 (바위로 가위를 이김)-
		 * 
		 * 0<1 (가위가 바위를 짐)
		 * 1<2 (위로 보를 짐)
		 * 2<0 (보로 가위한테 짐)
		 * 
		 * 
		 * 
		 * 컴퓨터가 가위바위보를 랜덤으로 
		 * 뽑게하고 내가 입력한 숫자랑 비교해서 
		 * 
		 * 이겼으면 이겼다
		 * 졌으면 졌다
		 * 비겼으면 비겼다
		 * 
		 * ex) com 0 user 1 
		 * 		-> 컴 : 가위 , 유저: 바위
		 * 			 당신이 이겼습니다.
		 */
		
		System.out.println("가위:0, 바위:1, 보:2  중 하나를 입력하세요.");
		int user = sc.nextInt();
		int com = (int)(Math.random()*3)+0; //0 써도 되고 안써도된다
		
		if(user == com) {
			System.out.println("비겼습니다");
		}
		else if((user==0 && com==2) || (user==1 && com==0)|| (user==2 && com==1) ) {
			System.out.println("당신이 이겼습니다");
		}
		else if(user >2) {
			System.out.println("0~2를 입력하세요");
		}
		else {
			System.out.println("당신이 졌습니다");
		}
		System.out.printf("user:%d, com:%d \n",user,com);
	}

}
