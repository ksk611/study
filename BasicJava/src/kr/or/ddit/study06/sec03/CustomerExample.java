package kr.or.ddit.study06.sec03;

public class CustomerExample {
	/*
	 * Customer 3개 클래스 만들고 데이터 넣어보기
	 */
	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.name ="장원영";
		c1.nation ="한국";
		c1.age =20;
		System.out.println(c1);
		
		//생성자 만들때 만들었던 순서대로 입력 해야 함 
		//파라미터가 3개 있는 것을 사용 했기 때문에 자동으로 생성자가 만들어지지 않음 . 
		//그래서 Customer 클래스에서 기본생성자 만들어줘야함
		Customer c2 = new Customer("한국","혜린",25);
		System.out.println(c2);

		
		Customer c3 = new Customer("안유진",23);
		System.out.println(c3);
		
		
		
	}
}
