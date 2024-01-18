package kr.or.ddit.study07.sec01.prod;

public class ProdMain {
    public static void main(String[] args) {
        Food food = new Food();
        String cal = food.getCal(); // cal 변수에 접근하여 값을 얻는 예시
        System.out.println(cal);
    }
}
