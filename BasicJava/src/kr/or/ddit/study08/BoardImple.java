package kr.or.ddit.study08;

//인터페이스의 상속을 받을때는 implements 사용
public class BoardImple implements IBoard{

	@Override
	public void writeBoard(String title, String content) {
		
		ILogin login = null;
		
		//핸드폰 여부 체크
		boolean phonchk = false;
		
		
		if(phonchk) login = new MobileLoginImple();
		else login = new LoginImple();
		
		login.login("id", "pass");
		
		
		/*
		 * 디비에 데이터 넣어주기 
		 */
		
		
	}

}
