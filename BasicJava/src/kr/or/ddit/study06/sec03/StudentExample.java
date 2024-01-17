package kr.or.ddit.study06.sec03;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student("n1",20);
		Student s2 = new Student("406호","n2",20);
		Student s3 = new Student("일본","307호","n3",20);
		//피플 클래스 안에 age name 을 빼옴
		Student s4 = new Student(new People("일본",20));
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}

}
