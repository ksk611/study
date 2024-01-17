package kr.or.ddit.homework.home12;

public class Tv {
	String com; 
	int year; 
	double size; 
	
	public Tv() {
		
	}
	public Tv(String com,int year, double size) {
		this.com=com;
		this.year=year;
		this.size=size;
	}
	@Override
	public String toString() {
		return "Tv [com=" + com + ", year=" + year + ", size=" + size + "]";
	}
	

}
