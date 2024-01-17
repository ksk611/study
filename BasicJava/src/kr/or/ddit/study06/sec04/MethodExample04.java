package kr.or.ddit.study06.sec04;

public class MethodExample04 {
	public static void main(String[] args) {
		MethodExample04 me = new MethodExample04();
		//오버로딩-파라미터에 따라 출력 순서가 다르다
		me.method(3,4);
		me.method();
		me.method("테스트");
		me.method(10);
	}
	public void method() {
		System.out.println("1");
	}
	public void method(int a) {
		System.out.println("2");
	}
	public void method(String s) {
		System.out.println("3");
	}
	public void method(int a, int b) {
		System.out.println("4");
	}
	
	//부모클래스에서 정의해 놓은 내용을 다시 재정의 한다
	@Override
	public String toString() {
		return "MethodExample04 []";
	}
	

}
