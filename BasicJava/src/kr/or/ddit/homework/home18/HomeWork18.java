package kr.or.ddit.homework.home18;

import java.util.Scanner;

import kr.or.ddit.study07.sec02.Cat;
import kr.or.ddit.study07.sec02.Dog;

public class HomeWork18 {
	public static void main(String[] args) {
		/*
		 * 스캐너를 통해서 R,L,P 에 따라서 분배 방식 변경
		 * 
		 * 각 클래스 만들어 볼것
		 * 
		 * Schedular 부모클래스를 각각 상속 받을 것 
		 * getNextCall()
		 * sendCallToAgent();
		 * -----------------------------
		 * 1.RoundRobn
		 * 	 getNextCall
		 * 	 ->상담 전화를 대기열에서 차례대로 가져옴
		 * 	 sendCallToAgent
		 * 	 ->차례대로 상담원에게 상담전화를 분배
		 * 2.LeastJob
		 * 	 getNextCall
		 *   ->상담 전화를 대기열에서 차례대로 가져옴
		 *   sendCallToAgent
		 * 	 ->대기열이 가장 짧은 상담원에게 상담전화를 분배 
		 * 3.PriorityAllocation
		 * 	 getNextCall
		 *   ->우선순위가 높은 상담전화를 대기열에서 가져옴
		 *   sendCallToAgent
		 * 	 ->업무 스킬이 가장 우수한 상담원에게 상담전화 분배
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		Schedular s = null;
		
		System.out.println("전화상담의 분배 방식 선택");
		System.out.println("R : RoundRobn");
		System.out.println("L : LeastJob");
		System.out.println("P : PriorityAllocation");
		System.out.println("선택 >> ");
		
		String sel = sc.nextLine(); 
		if(sel.equals ("R")) {
			s = new RoundRobn();
		}
		if(sel.equals("L")) {
			s = new LeastJob();
		}
		if(sel.equals("P")) {
			s = new PriorityAllocation();
		}
		s.getNextCall();
		s.sendCallToAgent();
		
		
		
	}

}
