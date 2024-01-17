package kr.or.ddit.homework.home12;

public class HomeWork12 {
	public static void main(String[] args) {
		/*
		 * 1. 다음을 만족하는 Student 클래스를 설계
		 * String 형의 학과와 정수형의 학번을 필드로 선언
		 * HomeWork12 에서 Student 객체를 생성하고 
		 * 학과와 학번을 적당한 값을 넣고 출력
		 * 
		 * 2. 다음을 만족하는 TV클래스를 설계
		 * Tv 클래스에 제조사 생산년도 크기를 필드로 선언
		 * 생성자(제조사, 생산년도, 크기)를 통해 객체를 만들고 
		 * printTv라는 메소드에서 값을 출력할 것
		 * 
		 * 3. 세 과목의 성적을 입력받고 총점메소드  합 메소드를 통해 출력할 수 있는
		 * Grade class 설계
		 */
		Student s = new Student();
		
		String s1 ="경영학";
		System.out.println(s.department(s1));
		
		int i1 = 201924088;
		System.out.println(s.id(i1));
		
		Tv t1 =  new Tv("삼성",2024,100.2);
		System.out.println(t1);
		
		//이렇게 값저장하려면 public Grade(int kor,int eng, int math)선언해줘야함
		Grade grade = new Grade(100,80,77);
		
		System.out.println("총점 :"+grade.sum());
		System.out.println("평균 :"+grade.avg());
	}

}
