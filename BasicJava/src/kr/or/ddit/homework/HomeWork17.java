package kr.or.ddit.homework;

import java.util.Calendar;
import java.util.Scanner;


public class HomeWork17 {
    public static void main(String[] args) {
        HomeWork17 obj = new HomeWork17();
        obj.process();
    }

    public void process() {
        Scanner sc = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();

        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;

        while (true) {
            System.out.println("\t\t    " + year + "년" + month + "월");
            System.out.println("--------------------------------------------------");
            System.out.println("<<작년    이전달<\t\t\t   > 다음달    내년>>");
            System.out.println("--------------------------------------------------");
            System.out.println("일\t월\t화\t수\t목\t금\t토\t");

            cal.set(Calendar.YEAR, year);
            cal.set(Calendar.MONTH, month - 1);
            cal.set(Calendar.DATE, 1);

            // 월의 시작 요일 (1: 일요일, 2: 월요일, ..., 7: 토요일)
            int startDayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

            // 시작 요일까지 빈 칸 출력
            for (int i = 1; i < startDayOfWeek; i++) {
                System.out.print("\t");
            }

            int lastDay = cal.getActualMaximum(Calendar.DATE);
            int currentDayOfWeek = startDayOfWeek;

            for (int day = 1; day <= lastDay; day++) {
                System.out.print(day + "\t");

                if (currentDayOfWeek == Calendar.SATURDAY) {
                    System.out.println();
                    currentDayOfWeek = Calendar.SUNDAY; // 다음 주의 시작 요일은 일요일로 설정
                } else {
                    currentDayOfWeek++;
                }
            }

            System.out.println();  // 월 마지막 날 출력 후 줄바꿈

            // 사용자 입력 처리
            System.out.print("'<<', '<','>','>>', 그 외 종료): ");
            String userInput = sc.nextLine();

            if ("<<".equals(userInput)) {
                year--;
            } else if ("<".equals(userInput)) {
                cal.add(Calendar.MONTH, -1);
            } else if(">>".equals(userInput)){
            	year++;
            }else if(">".equals(userInput)) {
            	cal.add(Calendar.MONTH, +1);
            }else {
                break;
            }

            month = cal.get(Calendar.MONTH) + 1;
        }

        sc.close();
    }
}