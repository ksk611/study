package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork05 {

   Scanner sc = new Scanner(System.in);
   public static void main(String[] args) {
      HomeWork05 hw = new HomeWork05();
//      hw.method1();
//      hw.method2();
//      hw.method3();
//      hw.method4();
//      hw.method5();
//      hw.method6();
        hw.method7();
   }
   
   public void method1() {
      /*
       *   for 문을 이용해서 다음 모양을 
       *   그려 보시오.
       *   
       *     *
       *     **   
       *     ***
       *     ****
       *     
       */
      System.out.println("숫자를 입력해 주세요");
      int num = sc.nextInt();
      
      for(int i=0; i<num; i++) {
         for (int j = 0; j <= i; j++) {
            System.out.print("*");
         }
         System.out.println();
      }
   }
   
   public void method2() {
      /*
       *   for 문을 이용해서 다음 모양을 
       *   그려 보시오.
       *   
       *        *
       *       **   
       *      ***
       *     ****
       *     
       */
//      System.out.println("숫자를 입력해 주세요");
//         int num = sc.nextInt();
//         
//         for(int i=0; i<num; i++) {
//            for (int j = 0; j <= i; j++) {
//               System.out.print("*");
//            }
//            System.out.println();
//         }
      
      System.out.println("숫자를 입력해 주세요");
      int num = sc.nextInt();
      for(int i=0; i<num; i++) {
         //스페이스는 넘 5면 -1(0번 i)-1
         for (int space = 0; space < num-i-1; space++) {
            System.out.print(" ");
         }
         
         for (int star = 0; star <= i; star++) {
            System.out.print("*");
         }
         System.out.println();
      }
   }
   
   public void method3() {
      /*
       *   for 문을 이용해서 다음 모양을 
       *   그려 보시오.
       *   
       *     ****
       *     ***   
       *     **
       *     *
       *     
       */
      System.out.println("숫자를 입력해 주세요");
      int num = sc.nextInt();
      for(int i=0; i<num; i++) {
         for (int star=num; star > i; star--) {
            System.out.print("*");
         }
         System.out.println(); 
      }
   }
   
   public void method4() {
      /*
       *   for 문을 이용해서 다음 모양을 
       *   그려 보시오.
       *   
       *     ****
       *      ***   
       *       **
       *        *
       *     
       */
      
      System.out.println("숫자를 입력해 주세요");
      int num = sc.nextInt();
      for (int i = 0; i < num; i++) {
         for (int j = 1; j <= num; j++) {
            if (i < j) {
               System.out.print("*");
            } else
               System.out.print(" ");
         }
         System.out.println();
      }
   }
   
   public void method5() {
      /*
       *   for 문을 이용해서 다음 모양을 
       *   그려 보시오.
       *   
       *       *
       *      ***
       *     *****
       *    *******   
       *     
       */
      
      System.out.println("숫자를 입력해 주세요");
      int num = sc.nextInt();

           //행을 나타냄
           for (int i = 0; i < num; i++) {

               //공백을 출력
               for (int j = 0; j < num - i - 1; j++) {
                   System.out.print(" ");
               }

               //'*'을 출력
               for (int k = 0; k < 2 * i + 1; k++) {
                   System.out.print("*");
               }
               System.out.println();
           }
      
   }
   
   public void method6() {
      /*
       *    예 ) 4입력했을때
       * 
       *   for 문을 이용해서 다음 모양을 
       *   그려 보시오.
       *   
       *    *******   
       *     *****
       *      ***
       *       *
       *     
       */
      
      
      System.out.println("숫자를 입력해 주세요");
      int num = sc.nextInt();
           for (int i = 0; i < num; i++) {

               for (int j = 0; j < i; j++) {
                   System.out.print(" ");
               }

               for (int k = 0; k < 2 * (num - i) - 1; k++) {
                   System.out.print("*");
               }
               System.out.println();
           }
      
   }
   
   public void method7() {
      /*
       *   for 문을 이용해서 다음 모양을 
       *   그려 보시오.
       *   
       *   ****
       *   *  *
       *   *  *
       *   ****  
       * 4 4
       */
      System.out.println("행의 개수와 열의 개수를 입력해 주세요");
      int num = sc.nextInt();// 행의 개수, 모양의 높이
      int num2 = sc.nextInt();// 열의 개수, 모양의 너비
   
        // 행을 나타냄
        for (int i = 0; i < num; i++) {

            // 열을 나타냄
            for (int j = 0; j < num2; j++) {

                // 가장자리에 있는 경우 '*' 출력
                // 그 외의 경우 ' ' 출력
                if (i == 0 || i == num - 1 || j == 0 || j == num2 - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
   
   
   
   
}
