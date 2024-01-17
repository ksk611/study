package kr.or.ddit.homework;

import java.util.Calendar;
import java.util.Scanner;

public class HomeWork17 {
      Scanner sc = new Scanner(System.in);

      public static void main(String[] args) {
         HomeWork17 obj = new HomeWork17();
         obj.process();
      }
      public void process() {
         Calendar cal = Calendar.getInstance();
         // 월 마지막 일
         
         while(true) {
        	 cal.set(Calendar.DATE,1);
        	 int lastDay = cal.getActualMaximum(Calendar.DATE);
        	 
        	 // 일주일중 현재 요일
        	 int day = cal.get(Calendar.DAY_OF_WEEK);
        	 System.out.print("\t");
        	 for (int i = 1; i <= lastDay; i++) {
        		 System.out.print(i+"\t");
        		 if(i==5) System.out.println();
        	 }
        	 
        	 /*
        	  * 
        	  *     2024.01
        	  * -----------------    
        	  * 이전달<       >다음달
        	  * -----------------
        	  * 일 월 화 수 목 금 토
        	  *   1 2 3 4 5 6
        	  * 7 8 9 10........  
        	  * 
        	  * 
        	  * 
        	  */
         }
      }
   }

