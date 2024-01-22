package kr.or.ddit.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HomeWork20 {
	public static void main(String[] args) {
		HomeWork20 obj = new HomeWork20();
		obj.process();
		
	}

	private void process() {
		List<Map> parkList = dataInput();
		String carNum = "5961";
		//입력한 차량 주차 시간계산
		//입력한 차량 주차 요금계산
	}
	
	public int pay(int min) {
		/*
		 * 기본시간	 기본요금		단위시간		단위요금
		 * 	60분 	 2000		10분			300원
		 * 
		 * ex) 73분 60+13
		 * 		기본요금 2000+600-> 2600원 리턴
		 * 10분에 300 나머지 있을시에도 +300
		 */
		
		return 0;
	}
	
	public int getMin(List<Map> parkList,String carNum) {
		/*
		 * 
		 */
		
		return 0;
	}
	
	public int getTime(String time) {
//		05:34 ->05 34
//		hour<- 05 
//		mins <- 34
		//334
//		07:59 ->07 59
//		hour<- 07
//		mins <- 59
		//479
		//479-334 -> 사용시간
		List<Map> parkList = dataInput();
		
		int hour= Integer.parseInt(time.split(":")[0]);
		int mins= Integer.parseInt(time.split(":")[1]);
		int getTime = hour*60+mins;
		return getTime;
	}
	
	private List<Map> dataInput() {
		/*
		 *  시각		차량번호		내역
		 *  05:34	5961		입차
		 *  06:00	0000		입차
		 *  06:34	0000		출차
		 *  07:59	5961		출차
		 *  07:59	0148		입차
		 *  18:59	0000		입차
		 *  19:09	0148		출차
		 *  22:59	5961		입차
		 *  23:00	5961		출차
		 *  23:00	0000		출차
		 */
		List<Map> parkList = new ArrayList<Map>();
		Map m1 = new HashMap();
		m1.put("시각", "05:34");
		m1.put("차량번호", "5961");
		m1.put("내역", "입차");
		
		Map m2 = new HashMap();
		m2.put("시각", "06:00");
		m2.put("차량번호", "0000");
		m2.put("내역", "입차");
		
		Map m3 = new HashMap();
		m3.put("시각", "06:34");
		m3.put("차량번호", "0000");
		m3.put("내역", "출차");
		
		Map m4 = new HashMap();
		m4.put("시각", "07:59");
		m4.put("차량번호", "5961");
		m4.put("내역", "출차");
		
		Map m5 = new HashMap();
		m5.put("시각", "07:59");
		m5.put("차량번호", "0148");
		m5.put("내역", "입차");
		
		Map m6 = new HashMap();
		m6.put("시각", "18:59");
		m6.put("차량번호", "0000");
		m6.put("내역", "입차");
		
		Map m7 = new HashMap();
		m7.put("시각", "19:09");
		m7.put("차량번호", "0148");
		m7.put("내역", "출차");
		
		Map m8 = new HashMap();
		m8.put("시각", "22:59");
		m8.put("차량번호", "5961");
		m8.put("내역", "입차");
		
		Map m9 = new HashMap();
		m9.put("시각", "23:00");
		m9.put("차량번호", "5961");
		m9.put("내역", "출차");
		
		Map m10 = new HashMap();
		m10.put("시각", "23:00");
		m10.put("차량번호", "0000");
		m10.put("내역", "출차");
		
		List<Map> salaryList = new ArrayList();
	    parkList.add(m1);
	    parkList.add(m2);
	    parkList.add(m3);
	    parkList.add(m4);
	    parkList.add(m5);
	    parkList.add(m6);
	    parkList.add(m7);
	    parkList.add(m8);
	    parkList.add(m9);
	    parkList.add(m10);
		
	    System.out.print(parkList);
		return parkList;
	}

}
