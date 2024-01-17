package kr.or.ddit.practice;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork08 {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		HomeWork08 obj = new HomeWork08();
		obj.process();

	}
	public void process(){
		/*
		 * 5개의 점수를 입력받고
		 * 
		 * 길이가 5개짜리인 int 배열 값을 저장해보자
         * 
         * 그 후 1을 선택하면 오름차순 정렬
         *     2를 선택하면 내림차순 정렬
         * 
         * 정렬된 그 결과 값을 출력
		 */
		//길이가 5개 짜리인 int 배열에 값을 저장
		int[] jumsuArr = new int[5];

		// 5개의 점수를 입력 받고
		//i : 0 1 2 3 4
		for(int i=0;i<5;i++) {
			jumsuArr[i] = sc.nextInt(); //int를 리턴
		}
		
		//배열 출력
		System.out.println(Arrays.toString(jumsuArr));
		
		//오름차순 정렬
		//배열의 길이 : 배열명.length
		//i : 1 2 3 4
		//*암기! 버블정렬의 회전수는 (배열의 길이 -1)
		for (int i = 1; i < jumsuArr.length; i++) {
			//1회전 : ㅓ :0,
			for (int j = 0; j < jumsuArr.length-1; j++) {
				
			}
		}
      }
}
	
	



