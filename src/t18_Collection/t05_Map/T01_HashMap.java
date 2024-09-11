package t18_Collection.t05_Map;

import java.util.HashMap;
import java.util.Map;

/*
	Map계열 자료구조 : 사전식자료구조, Web에서의 JSON데이터형식과 같다.
	순서와 관계없다. '키'와 '값(Value)'으로 구성된 자료구조이다. 자료 '검색/삭제/수정' 시에는 '키'를 이용
	중복 => '키'는 중복 불가  /  '값'은 중복 가능
*/
public class T01_HashMap {
	public static void main(String[] args) {
		//HashMap<Integer, String> map = new HashMap<Integer, String>();
			HashMap<Integer, String> map = new HashMap<>();
		//Map<Integer, String> map = new HashMap<>();
		
			System.out.println("1.크기 : " + map.size());
			System.out.println("2.자료 : " + map);
			System.out.println();
			
			
		// 자료 삽입 : put(키, 값)
			map.put(11, "홍길동");
			map.put(13, "김말숙");
			map.put(21, "이기자");
			map.put(15, "강감찬");
			map.put(17, "오사랑");
			map.put(19, "고인돌");
			System.out.println("3.크기 : " + map.size());
			System.out.println("4.자료 : " + map);
			System.out.println();
			
		// 추가 13번의 경우 (키값은 그대로이나 값은 덮어쓰기 됨)
			map.put(13, "김말자");
			map.put(20, "김말자");
			System.out.println("5.크기 : " + map.size());
			System.out.println("6.자료 : " + map);
			System.out.println();
			
		// 검색 : get()
			
			System.out.println("7.검색(13) : " + map.get(13));
			System.out.println();
			
			
		// 수정 : put	
			System.out.println("8.수정(13) : " + map.put(13, "이사랑"));
			System.out.println();
			System.out.println("9.크기 : " + map.size());
			System.out.println("10.자료 : " + map);
			System.out.println();
			
			// 삭제 : remove()
			System.out.println("11.삭제(13) : " + map.remove(13));
			System.out.println();
			System.out.println("12.크기 : " + map.size());
			System.out.println("13.자료 : " + map);
			System.out.println();
			
			// 모두삭제 : clear
			map.clear();
			System.out.println("14.크기 : " + map.size());
			System.out.println("15.자료 : " + map);
	}
}
