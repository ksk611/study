package kr.or.ddit.study05;

import java.util.Scanner;

public class ArrayExample01 {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayExample01 obj = new ArrayExample01();
//		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
//		obj.method5();
		obj.method6();
	}
	private void method6() {
		/*
		 * 로또 번호 6개 출력
		 * 1. 로또 배열 45개 생성
		 * 2. 각 배열에 값을 넣기
		 * 3. 배열섞기
		 * 4. 45개 배열 중에 앞에서 6개 출력
		 */
		//1
		int[]lotto = new int [45];
		
		//2
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i+1;
		}
		
		//3
		for (int i = 0; i < 100000; i++) {
			int ran = (int)(Math.random()*lotto.length);
			int temp = lotto[ran];
			lotto [ran] = lotto[0];
			lotto [0] = temp;
		}
		
		//4
		for (int i = 0; i < 6; i++) {
			System.out.print(lotto[i]+"\t");
		}
		
		//5 배열길이가 6개인 배열을 생성하여
		//  로또 번호 앞에 6개를 복사하기
		int[] l =new int[6];
		for (int i = 0; i < 6; i++) {
			l[i] = lotto[i];
		}
		
	
		
	}
	private void method5() {
		/*
		 * 타입별 초기 값
		 * boolean : false
		 * char		:\u0000, ' '
		 * byte, short, int, long : 0
		 * float	:0.0f
		 * double	:0.0
		 * 
		 * reference type : null ex)String
		 * 
		 */
		
		boolean[] bArr = new boolean[10];
		for (int i = 0; i < bArr.length; i++) {
			System.out.println(bArr[i]);
			
		}
	}
	private void method4() {
		int[] score = {77,95,57,67,84};
		/*
		 * 최대값 구하기
		 */
		int max =score[0];
		int min =score[0];
		for(int i=0; i<score.length;i++) {
			if(max < score[i]) {
				max = score[i];
			}
			if(min > score[i]) {
				min = score[i];
			}
		}
		System.out.println("최대값 : "+max+"최소값 : "+min);
	}
	private void method3() {
		/*
		 * int 타입 변수 5개 저장하고
		 * 역순으로 출력
		 */
		int[] arr = {1,2,3,4,5};
		for(int i=0; i<arr.length;i++ ) {
			System.out.println(arr[arr.length-1-i]);
		}

	}
	private void method2() {
		/*
		 * 크기 5짜리 int 타입 배열생성
		 * [] <- 배열선언
		 * arr <- 배열이름
		 * new <- 객체생성
		 * 타입[숫자] <- 생성될 갯수
		 */
		int[] arr = new int[5];
//		System.out.println(arr);
		
		//크기 5 짜리 int 타입의 배열을 생성하고
		//데이터를 저장
		//{10,20,30,40,50};
		//, <- 데이터 구분
		//10<- 같은 타입의 데이터입력
		int [] arr2 = {10,20,30,40,50};

	}
	private void method1() {
		/*
		 * 학생 점수 10 개 선언 해서 값을 저장
		 * int
		 */

		int[] arr = new int[10]; //new는 객체  생성 int 변수 10개를 만들었다
		arr[0] = 70;
		arr[1] = 70;
		arr[2] = 70;
		arr[3] = 70;
		arr[4] = 70;
		arr[5] = 77;
		arr[6] = 77;
		arr[7] = 77;
		arr[8] = 77;
		arr[9] = 77;
		//배열.length 배열의 길이
		int sum = 0;
		for(int i=0; i<arr.length;i++) {
			sum+=arr[i];
			System.out.println(arr[i]);
		}
		System.out.println("총합은 : "+sum);
		

	}

}
