package kr.or.ddit.study06.sec02;

public class Book {
	/*
	 * 책제목, 작성자, 등록일, 책 설명
	 */
	String nation = "한국";
	String bookname;
	String name;
	String date;
	String ex;
	@Override
	public String toString() {
		return "Book [nation=" + nation + ", bookname=" + bookname + ", name=" + name + ", date=" + date + ", ex=" + ex
				+ "]";
	}
	
	

}
