package kr.or.ddit.study05;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample03 {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayExample03 obj = new ArrayExample03();
//		obj.method1();
//		obj.method2();
//		obj.method3();
		obj.method4();
//		obj.method5();
//		obj.method6();
	}
	private void method4() {
		/*
		 * Arrays 배열 관련된 처리를 해주는 클래스 
		 */
		
		int[] arr = {4,2,3,5,1};
		
		// 배열안에 값을 문자열로 반환
		//Arrays.toString
		System.out.println(Arrays.toString(arr));
		
		//배열 값을 정렬
		//Arrays.sort
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	private void method3() {
		//국어 영어 수학
		String[] name = {"홍길동","강감찬","이순신"};
		int[][] scores = {{80,75,87,},{88,90,91},{77,73,65}};
	
		//이순신에 수학점수 출력
		int[] lee = scores[2];
		System.out.println("이순신 수학 점수: "+lee[2]);
		//System.out.println(scores [2][2]);
		
		//홍길동에 국어점수 출력
		System.out.println(scores [0][0]);
		
		//3명의 국어 점수 평균 출력
	
		int kor_sum=0;
		for (int i = 0; i < scores.length; i++) {
			kor_sum += scores[i][0];
		}
		System.out.println(kor_sum/3.0);
		
		//강감찬의 점수 평균 
		int kang_sum=0;
		for (int i = 0; i < scores.length; i++) {
			kang_sum += scores[1][i];
		}
		System.out.println((double)kang_sum/scores.length);
	}
	private void method2() {
		//1차원 배열 건너뛰기
		int[][]arr = new int [3][];
		
		int[] score1 = {100,90,80,80};
		int[] score2 = {91,81,72,67};
		int[] score3 = {84,62,70,80,40};
		
		arr[0] = score1;
		arr[1] = score2;
		arr[2] = score3;
		
		//첫번째 for문은 [3]갯수
		for (int i = 0; i < arr.length; i++) {
			//두번째 for문은 [] 배열의 길이
			for (int j = 0; j < arr[i].length; j++) {				
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
	private void method1() {
		/*
		 * 2차원 배열
		 * 1차원 배열로 배열을 만든것
		 * 
		 */
		int[] num1 = {1,2,3};
		int[] num2 = {2,3,4}; //꺼내면 int
		int[][] arr = new int[2][3]; //꺼내면 1차원 배열 [2]<-1차원배열 2개 [3]<-원소배열갯수 (3이 지워지면 여러개일때)
		arr[0] = num1;
		arr[1] = num2;
		System.out.println(arr);
		System.out.println(num1);
		System.out.println(num2);
		
		System.out.println(arr[0][0]);// 원하는 값 꺼내는법 1출력
		System.out.println(arr[1][2]); //원하는 값 꺼내는법 4출력
		
		//전체다 꺼내는법
		for (int i = 0; i < arr.length; i++) {
//			int[] temp=arr[i];
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]+"\t");
//				System.out.println(temp[j]+"\t");
			}
			System.out.println();
		}
	
	
}

}
