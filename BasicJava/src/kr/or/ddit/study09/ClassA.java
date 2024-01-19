package kr.or.ddit.study09;

import kr.or.ddit.study09.ClassA.ClassB.ClassC;

public class ClassA {
	
	public static void main(String[] args) {
		ClassA a = new ClassA();
		ClassB b = a.new ClassB();
		ClassC c = b.new ClassC();
		
	}
	
	//클래스b에 대한 내용을 숨기고 싶을때 중첩 클래스 사용
	class ClassB{
		class ClassC{
			
		}
	}

}
