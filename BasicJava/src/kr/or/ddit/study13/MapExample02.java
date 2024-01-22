package kr.or.ddit.study13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MapExample02 {
   Scanner sc = new Scanner(System.in);

   public static void main(String[] args) {
      MapExample02 obj = new MapExample02();
      obj.dataInput();
      obj.process();
   }
   
   public void process() {
      List<Map> salList = dataInput();
      int max = getMaxSalary(salList);
      System.out.println("최대 월급값은 : "+ max);
      printEmp103(salList);
      Map<String, Integer> addDeptMap = getAddDept(salList);
      
//      Set keySet = addDeptMap.keySet();
//      Iterator<String> it = keySet().iterator();
      //  위 주석과 같은 방법
      Iterator<String> it = addDeptMap.keySet().iterator();
      while(it.hasNext()) {
    	  String key = it.next();
    	  int val = addDeptMap.get(key);
    	  System.out.println(key + " : "+ val);
      }
      
//      System.out.println("영업부 : " +addDeptMap.get("영업부"));
//      System.out.println("기획부 : "+addDeptMap.get("기획부"));
//      System.out.println("총무부 : "+addDeptMap.get("총무부"));
      
   }
   public Map<String, Integer> getAddDept(List<Map> salList) {
	    Map<String, Integer> resultMap = new HashMap<>();
	    for (Map map : salList) {
	        String dept = (String) map.get("dept");
	        int salary = (int) map.get("salary");

	        int sum = 0;
	        if (resultMap.containsKey(dept)) {
	            sum = resultMap.get(dept);
	        }
	        sum += salary;

	        resultMap.put(dept, sum);
	    }
	    return resultMap;
	}

   
   
   public void printEmp103(List<Map> salList) {
      /*
       * emp_no 203 정보 출력하기
       * get을 이용해볼것.
       */
	   
	   for (int i = 0; i < salList.size(); i++) {
		Map map = salList.get(i);
		int emp_no = (int)map.get("emp_no");
		if(emp_no != 103) continue;
		
		/*
		 * emp_no,emp_name, dept, salary
		 */
		int emp_no2 = (int)map.get("emp_no");
		String emp_name = (String)map.get("emp_name");
		String dept = (String)map.get("dept");
		int salary = (int)map.get("salary");
		
		System.out.println(emp_no2 +"\t"+emp_name+"\t"+dept+"\t"+salary);
		
	}
	   
	   
	   
	   
	   
   }
   
   public int getMaxSalary(List<Map> salList) {
      /*전체사원중에 가장 높은 월급 값을 리턴
       * 
       */
	  int max = 0;
	  for (int i = 0; i < salList.size(); i++) {
		Map map = salList.get(i);
		int sal = (int) map.get("salary");
		if(max == 0) {
			max= sal;
		}
		
		if(max<sal) {
			max = sal;
		}
		
	  } 
	 
      return max;
   }

   private List dataInput() {
      
      /*
       * emp_no,emp_name, dept, salary
       * 101     홍길동            영업     300   
       * 102     홍길두            기획     350   
       * 103     홍길삼            기획     500   
       * 104     홍길넷            영업     350   
       * 105     홍길오            총무     250   
       * 
       * 5개의 맵을 각자 선언 및 데이터 입력
       * ex Map map1 = new Hashmap();
       * map1.put("emp_no,101);
       */
      
      Map map1 = new HashMap();
      map1.put("emp_no",101);
      map1.put("emp_name","홍길동");
      map1.put("dept","영업부");
      map1.put("salary",300);
      
      Map map2 = new HashMap();
      map2.put("emp_no",102);
      map2.put("emp_name","홍길두");
      map2.put("dept","기획부");
      map2.put("salary",350);
      
      Map map3 = new HashMap();
      map3.put("emp_no",103);
      map3.put("emp_name","홍길삼");
      map3.put("dept","기획부");
      map3.put("salary",500);
      
      Map map4 = new HashMap();
      map4.put("emp_no",104);
      map4.put("emp_name","홍길넷");
      map4.put("dept","영업부");
      map4.put("salary",350);
      
      Map map5 = new HashMap();
      map5.put("emp_no",105);
      map5.put("emp_name","홍길오");
      map5.put("dept","총무부");
      map5.put("salary",250);
      
      List<Map>salaryList = new ArrayList();
      salaryList.add(map1);
      salaryList.add(map2);
      salaryList.add(map3);
      salaryList.add(map4);
      salaryList.add(map5);
      
      return salaryList;
   }

}