package kr.or.ddit.practice;

public class Practice1 {
	public static void main(String[] args) {
		// 변수 a와 b의 초기값 설정
		int a = 1;
		int b = 2;

		// 값을 서로 바꾸기 위해 임시 변수(temp) 사용
		int temp = a;
		a = b;
		b = temp;

		// 변수 a와 b의 값이 서로 바뀐 것을 확인
		System.out.println("a: " + a); // 출력 결과: 2
		System.out.println("b: " + b); // 출력 결과: 1

	}

}
