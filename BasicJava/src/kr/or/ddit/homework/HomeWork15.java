package kr.or.ddit.homework;

public class HomeWork15 {
	public static void main(String[] args) {
		/*
		 *   계산기 만들기.
		 *   
		 */
//		cal(10, "^", 5);
		cal(10, Oper.GOP, 5);
	}
	
	public static double cal(int a, Oper oper, int b) {
		if(oper == Oper.PLUS) return add(a, b);
		if(oper == Oper.MINUS) return min(a, b);
		if(oper == Oper.GOP) return mul(a, b);
		if(oper == Oper.NANUGI) return div(a, b);
		if(oper == Oper.PER) return per(a, b);
//		else System.out.println("지원하지 않는 연산자 입니다.");
		return 0;
	}
	
	
	public static double cal(int a, String oper, int b) {
		if(oper.equals("+")) return add(a, b);
		if(oper.equals("-")) return min(a, b);
		if(oper.equals("/")) return mul(a, b);
		if(oper.equals("*")) return div(a, b);
		else System.out.println("지원하지 않는 연산자 입니다.");
		return 0;
	}
	
	public static int per(int a, int b) {
		return a%b;
	}
	
	public static int add(int a, int b) {
		return a+b;
	}
	public static int min(int a, int b) {
		return a-b;
	}
	public static int mul(int a, int b) {
		return a*b;
	}
	public static int div(int a, int b) {
		return a/b;
	}
	
	// 3*4  숫자 2 연산자 1개
	public static double cal(String s) {
//		3*4
//		[3, 4]
		String[] oper = {"*","/"};
		for(int i=0; i<oper.length; i++) {
			if(s.contains(oper[i])) {
				String[] nums = s.split("\\"+oper[i]);
				int a = Integer.parseInt(nums[0]);
				int b = Integer.parseInt(nums[1]);
				return cal(a, oper[i], b);
			}
			
		}
//		if(s.contains("*")) {
//			String[] nums = s.split("\\*");
//			int a = Integer.parseInt(nums[0]);
//			int b = Integer.parseInt(nums[1]);
//			return cal(a, "*", b);
//		}
//		if(s.contains("/")) {
//			String[] nums = s.split("\\/");
//			int a = Integer.parseInt(nums[0]);
//			int b = Integer.parseInt(nums[1]);
//			return cal(a, "/", b);
//		}
//		if(s.contains("-")) {
//			String[] nums = s.split("\\-");
//			int a = Integer.parseInt(nums[0]);
//			int b = Integer.parseInt(nums[1]);
//			return cal(a, "-", b);
//		}
//		if(s.contains("+")) {
//			String[] nums = s.split("\\+");
//			int a = Integer.parseInt(nums[0]);
//			int b = Integer.parseInt(nums[1]);
//			return cal(a, "+", b);
//		}
		
		
		return 0;
	}
	
	
	// 3*4.5+4 연산자n 숫자 n+1 개
	public static double cal2(String s) {
		double[] numList; 
		String[] operList; 
		
		String[] opers = {"*","/","-","+"};
		int cnt = 0;
		for(int i=0; i<s.length(); i++) {
			String temp = s.charAt(i)+"";
			for(String oper : opers ) 
				if(temp.equals(oper)) cnt++;
		}
		numList = new double[cnt+1];
		operList = new String[cnt];
		cnt = 0;
		String temp_num ="";
		for(int i=0; i<s.length(); i++) {
			String temp = s.charAt(i)+"";
			boolean operFlag = false;
			for(String oper : opers ) {
				if(temp.equals(oper)) {
					operFlag = true;
				}
			}
			if(operFlag) {
				numList[cnt] = Double.parseDouble(temp_num);
				operList[cnt] = temp;
				cnt++;
				temp_num = "";
			}else {
				temp_num+= temp;
			}
		}
		numList[cnt] = Double.parseDouble(temp_num);
		
		int add =0;
		for(int i=0; i<operList.length; i++) {
			String oper = operList[i];
			int c = i +add;
			if(oper.equals("*")) {
				double d = numList[c]*numList[c+1];
				numList[c+1] =0;
				numList[c] = d;
				add++;
			}
			if(oper.equals("/")) {
				double d = numList[c]/numList[c+1];
				numList[c+1] =0;
				numList[c] = d;
				add++;
			}
		}
		double sum =0;
		for(int i=0; i<operList.length; i++) {
			String oper = operList[i];
			if(oper.equals("-")) {
				numList[i+1] = -numList[i+1];
			}
		}
		
		for(double d : numList) sum+=d;
		
		return sum;
	}
	
	public void remove(String[] arr) {
		
	}
	
	
	
	
	
}
