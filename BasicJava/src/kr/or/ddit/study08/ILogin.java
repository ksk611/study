package kr.or.ddit.study08;

public interface ILogin {
	public boolean login(String id, String pass);
	
	public boolean sign(String id, String pass, String name, String tell);
	//실제 구현은 클래스 에서...
}
