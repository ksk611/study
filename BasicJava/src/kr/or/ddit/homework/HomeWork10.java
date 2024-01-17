package kr.or.ddit.homework;

public class HomeWork10 {
	public static void main(String[] args) {
		
		// 1 클래스 완성.
		
		// 2 클래스에 데이터 입력. // 이름 국 영 수
		Student s1 = new Student();
		s1.name = "n1";
		s1.kor  = 65;
		s1.eng  = 85;
		s1.math = 96;
		Student s2 = new Student();
		s2.name = "n2";
		s2.kor  = 77;
		s2.eng  = 85;
		s2.math = 89;
		Student s3 = new Student();
		s3.name = "n3";
		s3.kor  = 92;
		s3.eng  = 89;	;
		s3.math = 67;
		Student s4 = new Student();
		s4.name = "n4";
		s4.kor  = 75;
		s4.eng  = 63;
		s4.math = 100;
		Student s5 = new Student();
		s5.name = "n5";
		s5.kor  = 92;
		s5.eng  = 77;
		s5.math = 100;
		
		// 3 클래스를 클래스 배열에 담기.
		Student[] score = {s1, s2, s3, s4, s5};
		
		for(Student s : score) {
			// 평균 총합 구하기.
			s.sum = s.kor+s.eng+s.math;
			s.avg = s.sum/3.0;
		}
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score.length; j++) {
				if(score[i].sum <score[j].sum) {
					score[i].rank++;
				}
			}
		}
		
		for(int i=0; i<score.length-1; i++) {
			for(int j=0; j<score.length-1; j++) {
				if(score[j].sum < score[j+1].sum) {
					Student st = score[j];
					score[j] = score[j+1];
					score[j+1] = st;
				}
			}
		}
		
		for (Student student : score) {
			System.out.println(student);
		}
		
		
	}
}
class Student{
	// 이름, 국, 영, 수, 총점, 평균, 등수
	String name;
	int kor;
	int eng;
	int math;
	int sum;
	double avg;
	int rank = 1;
	@Override
	public String toString() {
		return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum=" + sum + ", avg="
				+ avg + ", rank=" + rank + "]";
	}
	
	
}