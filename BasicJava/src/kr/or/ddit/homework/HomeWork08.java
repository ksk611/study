package kr.or.ddit.homework;

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
		int[] scores = new int[5];

        for (int i = 0; i < scores.length; i++) {
            System.out.println("5개의 점수를 입력해 주세요");
            scores[i] = sc.nextInt();
        }

        System.out.print("입력받은 점수:");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + "\t");
        }
      //입력받은 배열 출력
      	System.out.println(Arrays.toString(scores));

        System.out.println("\n오름차순 : 1  내림차순 : 2");
        int num = sc.nextInt();

        if (num == 1) {
            int[] score = scores;
            for (int i = 0; i < score.length - 1; i++) {
                for (int j = 0; j < score.length - 1; j++) {
                    if (score[j] > score[j + 1]) {
                        int temp = score[j];
                        score[j] = score[j + 1];
                        score[j + 1] = temp;
                    }
                }
            }
            System.out.print("오름차순 정렬 결과:");
            for (int i = 0; i < score.length; i++) {
                System.out.print("\t"+score[i]);
            }
        }

        if (num == 2) {
            for (int i = 0; i < scores.length - 1; i++) {
                for (int j = 0; j < scores.length - 1; j++) {
                    if (scores[j] < scores[j + 1]) {
                        int temp = scores[j];
                        scores[j] = scores[j + 1];
                        scores[j + 1] = temp;
                    }
                }
            }
            System.out.print("내림차순 정렬 결과:");
            for (int i = 0; i < scores.length; i++) {
                System.out.print("\t"+ scores[i] );
            }
        }
        
      }
}
	
	



