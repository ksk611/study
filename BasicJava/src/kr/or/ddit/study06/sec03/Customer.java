package kr.or.ddit.study06.sec03;

public class Customer {
	/*
	 * 이름 국가 나이 
	 */
	String name;
	String nation;
	int age;
	
	//기본생성자
	public Customer() {
		
	}
	
	// 기본값을 설정해서 사용하고 싶을때 
	public Customer(String name, int age) {
		this.nation = "한국";
		this.name = name;
		this.age = age;
	}
	
	public Customer(String nation, String name, int age) {
		//this에 있는 nation은 클래스에 있는(String nation;)저장공간 
		//nation은 값을의미
		this.nation = nation;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", nation=" + nation + ", age=" + age + "]";
	}
	

}
