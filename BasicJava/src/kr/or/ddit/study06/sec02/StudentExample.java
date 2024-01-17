package kr.or.ddit.study06.sec02;

public class StudentExample {
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.kor=80;
		student1.eng=70;
		student1.math=90;
		student1.name = "김선경";
		
		student1.sum= student1.kor+student1.eng+student1.math;
		student1.avg= student1.sum/3.0;
		
		Student student2 = new Student();
		student2.kor=85;
		student2.eng=70;
		student2.math=98;
		student2.name = "김선경";
		
		student2.sum= student2.kor+student2.eng+student2.math;
		student2.avg= (student2.kor+student2.eng+student2.math)/3;
		
		System.out.println(student1.name+"\t"+student1.kor+"\t"+student1.eng+"\t");
		System.out.println(student2.name+"\t"+student2.kor+"\t"+student2.eng+"\t");
		
		System.out.println(student1);
		System.out.println(student2);
	}

}
