package kr.or.ddit.study06.sec03;

public class Constructor {
	int a;
	int b;
	int c;
	int d;
	
	
	public Constructor() {
		
	}
	public Constructor(int a) {
//		this.a = a;
		//b값에 20을 기본으로 넣는 생성자
		//this를 이용해서 호출
		//클래스 생성 후에 출력문 가능
		this(a,20);
		System.out.println("Constructor(int a) 호출");
	}
	public Constructor(int a, int b) {
		this(a,b,10,10);
		System.out.println("Constructor(int a, int b) 호출");
	}
	public Constructor(int a, int b, int c, int d) {
		this.a= a;
		this.b= b;
		this.c= c;
		this.d= d;
		System.out.println("Constructor(int a, int b, int c, int d) 호출");
	}
	
	@Override
	public String toString() {
		return "Constructor [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "]";
	}
	
}
