package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork16 {
	Scanner sc = new Scanner(System.in);
	
	Member[] memList = new Member[100];
	int cur =0;

	public static void main(String[] args) {
		HomeWork16 obj = new HomeWork16();
		obj.process();
	}
	public void process() {
		// 회원 관리 시스템
		while(true) {
			System.out.println("1.회원 가입");
			System.out.println("2.회원 탈퇴");
			System.out.println("3.정보 수정");
			System.out.println("4.회원 전체 정보 출력");
			/*
			 * 1,2,3,4 를 각각 입력했을때 해당하는 메소드 실행하기.
			 */
			int select = sc.nextInt();
			if(select == 1) {
				addMember();
			}
			if(select == 2) {
				delMember();
			}
			if(select == 3) {
				update();
			}
			if(select == 4) {
				printList();
			}
			
		}
	}
	public void delMember() {
		printList();
		System.out.println("삭제할 회원번호 입력 : ");
		int num = sc.nextInt();
		
		int add =0;
		for (int i = num; i < cur; i++) {
			memList[i]= memList[i+1];
		}
		cur--;
		printList();
	}
	public void addMember() {
		/*
		 * getter, setter 이용
		 * 정보 입력
		 * memList 에 저장
		 */
		Member mem = new Member();
		
		System.out.println("name을 입력해 주세요");
		mem.setName(sc.next());
		
		System.out.println("id를 입력해 주세요");
		mem.setId(sc.next());
		
		System.out.println("age를 입력해 주세요");
		mem.setAge(sc.nextInt());
		
		//0번째 배열부터 데이터 담아짐
		//cur는 회원정보
		System.out.println("회원 정보가 저장되었습니다");
		memList[cur++]= mem;
		
	}
	
	
	public void update() {
		printList();
		System.out.print("수정할 회원 번호 입력 : ");
		int num = sc.nextInt();
		Member mem = memList[num];
	
		System.out.println("name을 입력해 주세요");
		mem.setName(sc.next());
		
		System.out.println("id를 입력해 주세요");
		mem.setId(sc.next());
		
		System.out.println("age를 입력해 주세요");
		mem.setAge(sc.nextInt());
		
		printList();
		
	}
	
	public void printList() {
		System.out.println("========== 회원정보 출력  =========");
		for (int i = 0; i < cur; i++) {
			Member mem = memList[i];
			/*
			 * mem 정보 꺼내서 출력
			 */
			System.out.println("회원: "+ i );
			System.out.println("아이디: " + mem.getId());
			System.out.println("이름: " + mem.getName());
			System.out.println("나이: " + mem.getAge());
			System.out.println();
			
		}
	}

}
//vo 객체
class Member{
	private String id;
	private String name;
	private int age;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	

}
