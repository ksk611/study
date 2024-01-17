package kr.or.ddit.study06.sec03;

public class Sing {
	/*
	 * 노래이름
	 * 가수
	 * 가사
	 */
	String name;
	String singer;
	String content;
	int year;
	
	public Sing(){
		
	}
	
    public Sing(String s1, String s2,String s3,int i1){
		this.name = s1;
		this.singer = s2;
		this.content = s3;
		this.year = i1;
	}

	@Override
	public String toString() {
		return "Sing [name=" + name + ", singer=" + singer + ", content=" + content + ", year=" + year + "]";
	}
    
	

}
