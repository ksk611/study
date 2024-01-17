package kr.or.ddit.homework;

public class HomeWork11 {
	public static void main(String[] args) {
		/*
		 *  1. 생성자를 통해  x, y, 높이, 너비를 입력 받고 
		 *   area 값은 자동으로 계산 하도록 하자.
		 *   area 넓이 값은 높이 * 너비
		 */
		
		/*
		 *  2. 생성자를 통해  Point,  높이, 너비를 입력 받고
		 *    point 클래스에서 꺼낸 x, y 값을 통해 
		 *    1번 문제에 생성자를 호출 해보도록 하자.     
		 */
		
		/*
		 * 1, 2번 결과 출력.
		 */
		Rectangle r1 = new Rectangle(0,0,10,10);
		Rectangle r2 = new Rectangle(new Point(0,0),15,10);
		
		System.out.println(r1);
		System.out.println(r2);
		
	}
}
class Rectangle{
	int area; 
	int x;
	int y;
	int height;
	int width;
	// 가로 세로 입력 받고 사각형 전체 정보 출력해보기 area=넓이 
	
	
	public Rectangle(int x, int y, int height, int width) {
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
		this.area = height*width;
	}
	public Rectangle(Point p, int height, int width) {
//		this.x = p.x;
//		this.y = p.y;
//		this.height = height;
//		this.width = width;
//		this.area = height*width;
		this(p.x,p.y,height,width);
	}
	@Override
	public String toString() {
		return "Rectangle [area=" + area + ", x=" + x + ", y=" + y + ", height=" + height + ", width=" + width + "]";
	}
	

	
	
}

class Point{
	//x,y 값 대신 포인트를 생성자에 넣어주기 p.x,p.y
	int x;
	int y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
}


