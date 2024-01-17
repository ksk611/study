package kr.or.ddit.practice;

public class test {

	public static void main(String[] args) {
		int a = 3;
		int b = 0;
		
		System.out.println("a : " + a);
		
		//먼저 1증가 하고 저장
//		b = ++a;//a = 4, b = 4
//		b = ++a;//a = 5, b = 5
//		b = ++a;//a = 6, b = 6
		
		//a값을 먼저 저장하고 1 증가
		b = a++;//4, b = 3
		b = a++;//5, b = 4
		b = a++;//6, b = 5
	}

}
