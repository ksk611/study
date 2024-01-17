package kr.or.ddit.study06.sec05;

public class People {
	
	//단 하나의 값만 존재
	static int year =2023;
	
	String name;
	String gender;
	
	public People(String name, String gender) {
		this.name= name;
		this.gender= gender;
	}

	@Override
	public String toString() {
		return "People [year=" + year + ",name=" + name + ", gender=" + gender + "]";
	}
	
	
}
