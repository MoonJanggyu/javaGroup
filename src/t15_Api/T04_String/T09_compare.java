package t15_Api.T04_String;

import java.util.Objects;

public class T09_compare {
	public static void main(String[] args) {
		String a = "Seoul";
		String b = "seoul";
		String c = a+b;
		System.out.println("c : " + c);
		
		// compareTo() : 문자열 비교 (0: 동일한문자열 ) (음수: 앞의 문자열이 작음) (양수: 앞의 문자열이 크다)
		System.out.println(a.compareTo(b));
		System.out.println(a.compareTo(c));
		System.out.println(c.compareTo(a));

		// 공백비교 : equals(), isBlank()  - java 10이상, isEmpty() -- 이것은 공백처리 (java 8도 가능)
		System.out.println("1.c가 공백? " + c.equals(""));
	//	System.out.println("1.c가 공백? " + c.isBlank("")); // java 10 이상
		System.out.println("1.c가 공백? " + c.isEmpty());
		System.out.println("4.c가 null? " + Objects.isNull(c));
	}
}
