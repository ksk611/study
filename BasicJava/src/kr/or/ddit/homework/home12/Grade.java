package kr.or.ddit.homework.home12;

public class Grade {
	int kor ;
	int eng ;
	int math ;
	
	public Grade() {
		
	}
	public Grade(int kor,int eng, int math) {
		this.kor =kor;
		this.eng =eng;
		this.math =math;
	}
	
	public int sum() {
		return kor+eng+math;
	}
	public double avg() {
		return  (kor+eng+math)/3.0;
	}

}
