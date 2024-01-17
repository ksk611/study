package kr.or.ddit.study06.sec05;

import java.util.Arrays;

public class StaticTest {
	
	int field = 10;
//	static 은 타입앞에 적어줘야 한다.
	static int static_filed = 11;
	
	public static void main(String[] args) {
		//static 메소드는 바로 사용이 가능하다. new로 생성 안해도 됨. 
		StaticTest.s_method1();
		StaticTest.s_method2();
		System.out.println(StaticTest.static_filed);
		
//		Arrays.sort();
	}
	
	public void method1() {
		//method2() 호출가능 (같은 영역에 존재)

	}
	public void method2() {
		
	}
	public static void s_method1() {
		//s_method2() 호출가능 (같은 영역에 존재)
		//method1(), method2()는 호출 불가 (객체를 만들어줘야 호출가능)
		StaticTest st = new StaticTest();
		st.method1();
	}
	public static void s_method2() {
		
	}

}
