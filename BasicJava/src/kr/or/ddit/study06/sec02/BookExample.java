package kr.or.ddit.study06.sec02;

public class BookExample {
	public static void main(String[] args) {
		//책 클래스 2개 만들고 각각 데이터 입력 및 출력
		Book b1 = new Book();
		
		
		b1.bookname ="어린왕자";
		b1.name ="김선경";
		b1.date ="2024.01.08";
		b1.ex ="명작입니다.";
		
		
		Book b2 = new Book();
		
		b2.bookname ="오즈의 마법사";
		b2.name ="김선경";
		b2.date ="2024.01.08";
		b2.ex ="명작입니다.";
		
		System.out.println(b1);
		System.out.println(b2);
		
	}

}
