package kr.or.ddit.study13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
	/*
	 * HashMap
	 * key 와 value 로 이루어짐
	 * 
	 * key값은 중복을 허용하지 않고 순서가 보장되지 않음
	 * Map 타입의 컬렉션
	 *  
	 *  주요메소드
	 *  .put(key,value) : 데이터 입력 key 값은 중복 되지 않음 value는 중복 될 수 있음 
	 *  .get(key)		: 입력받은 value 값을 key 값을 통해 꺼내 올 수 있음
	 *  .keySet()		: key로 이루어진 hashSet 값을 가져옴
	 * 
	 */
//	HashMap map = new HashMap();
		//비밀번호, 비트 코인 컴퓨터에서 중요한 개념
		Map map = new HashMap();
		map.put("강미정", "305호");
//		map.put("강미정", "307호");
		map.put("김선경", "305호");
		map.put("허주희", "406호");
		
		//put으로 넣고 get으로 꺼냄
		//object <-기본값
		//object 가 더 큰 클래스 이기 때문에 타입변환을 해줘야함
		String str = (String)map.get("강미정");
		
		System.out.println(map.get("강미정"));
		System.out.println(map.get("허주희"));
		
		//벨류 값(제네릭)이 String으로 지정되어있기 때문에 꺼낼때 타입변환 하지 않아도 된다
		Map<String, String> map2 = new HashMap();
		map2.put("강미정", "305호");
		map2.put("강미정", "307호");
		map2.put("김선경", "305호");
		map2.put("허주희", "406호");
		String str2 = map2.get("허주희");
		
		//중복 허용 X,순서 보장 X
		
		Set set = map2.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
//			String key = (String)it.next();
			String key = it.next();
			String value = map2.get(key);
			System.out.println("key : "+key+", value : "+value);
		}
		
	}
	

}
