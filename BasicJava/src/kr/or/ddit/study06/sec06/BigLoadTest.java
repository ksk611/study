package kr.or.ddit.study06.sec06;

import java.util.Date;

public class BigLoadTest {
	public static void main(String[] args) {
		
		Date d1= new Date();
//		BigLoad b1 = BigLoad.getInstance();
		BigLoad b1 = new BigLoad();
		System.out.println("최초 로딩");
		
//		BigLoad b2 = BigLoad.getInstance();
		BigLoad b2 = new BigLoad();
		System.out.println("2 로딩");
		
//		BigLoad b3 = BigLoad.getInstance();
		BigLoad b3 = new BigLoad();
		System.out.println("3 로딩");
//		BigLoad.getInstance();
//		BigLoad.getInstance();
//		BigLoad.getInstance();
//		BigLoad.getInstance();
//		BigLoad.getInstance();
//		BigLoad.getInstance();
//		BigLoad.getInstance();
//		BigLoad.getInstance();
//		BigLoad.getInstance();
		Date d2 = new Date();
		
		System.out.println(d2.getTime() - d1.getTime());
	}

}
