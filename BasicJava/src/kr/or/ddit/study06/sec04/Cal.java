package kr.or.ddit.study06.sec04;

public class Cal {
	public static void main(String[] args) {
		Cal cal = new Cal();
		
		int add = cal.add(10, 5);

		System.out.println(add);
		
		int a= 10;
		int b=9;
		//값 저장하고 출력 할 수도 있다
		System.out.println(cal.minus(a,b));
		
		System.out.println(cal.div(a,b));
		
		int mul = cal.mul(5, 3);
		System.out.println(mul);
		
		int per = cal.per(6, 2);
		System.out.println(per);
		
	}
	
	public int add(int a, int b) {
		return a+b;
	}
	//더블 타입으로도 지원해주고 싶을때 오버로딩 사용 
	public double add(double a, double b) {
		return a+b;
	}
	
	public int minus(int a, int b) {
		return a-b;
	}
	public double div(int a, int b) {
		return a/b;
	}
	public int mul(int a, int b) {
		return a*b;
	}
	public int per(int a, int b) {
		return a%b;
	}

}
