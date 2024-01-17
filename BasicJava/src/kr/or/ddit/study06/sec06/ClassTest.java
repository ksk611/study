package kr.or.ddit.study06.sec06;

public class ClassTest {
	
	//vo - 데이터를 담을 수 있는 공간
	private static int year;
	private int feild1;
	
	public ClassTest() {
		
	}
	
	public ClassTest(int feild1) {
		super();
		this.feild1 = feild1;
	}
	//필드데이터 막아 놔서 getter(데이터 가져감) setter(데이터 입력) 만들어 줘야함
	public static int getYear() {
		return year;
	}

	public static void setYear(int year) {
		ClassTest.year = year;
	}

	public int getFeild1() {
		return feild1;
	}

	public void setFeild1(int feild1) {
		this.feild1 = feild1;
	}

	//오버라이드는 부모가 만든 메소드들를 재정의 함
	//여기서 부모는 Object
	@Override
	public String toString() {
		return "클래스: [feild1=" + feild1 + "]";
	}
	

}
