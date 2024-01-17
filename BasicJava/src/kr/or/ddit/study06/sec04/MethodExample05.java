package kr.or.ddit.study06.sec04;

public class MethodExample05 {
	int a = 10;
	public static void main(String[] args) {
		MethodExample05 me = new MethodExample05();
		me.method1();
	}
	public void method1() {
		//a라는 필드 값을 가져옴
		System.out.println(a);
	}

}
