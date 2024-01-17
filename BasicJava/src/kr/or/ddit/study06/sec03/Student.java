package kr.or.ddit.study06.sec03;

public class Student {
	String nation;
	String room;
	String name;
	int age;
	
	
	public Student() {
		
	}
	
	public Student(String nation, String room, String name, int age) {
		//4개 데이터를 전부 넣었을때
		this.nation= nation;
		this.room = room;
		this.name = name;
		this.age = age;
		System.out.println("(String nation, String room, String name, int age) 호출");
	}
	
	public Student(String room, String name, int age) {
		//3개의 데이터를 넣었을때 nation 기본 값은 한국
		this("한국",room,name,age);
		System.out.println("(String room, String name, int age) 호출");
	}
	//피플클래스
	public Student(People people) {
		this(people.name,people.age);
	}
	
	public Student(String name, int age) {
		//2개의 데이터를 넣었을때 room 305호 nation 기본 값은 한국
		this("305호",name,age);
		System.out.println("(String name, int age) 호출");
	}

	@Override
	public String toString() {
		return "Student [nation=" + nation + ", room=" + room + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
