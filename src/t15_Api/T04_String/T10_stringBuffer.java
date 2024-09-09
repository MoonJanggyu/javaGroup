package t15_Api.T04_String;

/*
  -> mutable(가변) / immutable(불가변)
  String객체 : immutable객체로서 class가 한번 생성되면 그 값을 유지한다. 주로 짧은 문자열처리에 적합
 	StringBuffer객체 : mutable객체로서 크기를 변경할 수 있다. 즉, 동기화를 제공. // 멀티스레드에서 주로 사용됨 // 가변길이 문자열에 적합
	StringBuilder객체 : mutable객체로서 크기를 변경할 수 있다.  동기화는 불분명 // 가변길이에 가장 적합
	성능은 StringBuilder -> StringBuffer -> String(가장 느림) 순이다.
*/

public class T10_stringBuffer {
	public static void main(String[] args) {
		
		String str = new String ("홍길동");
		System.out.println("1.str : " + str);
		
		
		str += "/홍길동2";
		System.out.println("2.str : " + str);
		
		// StringBuffer()객체 : 가변길이클래스 기본크기는 16, 넘칠때는 상황에 따라 크기 변경
		// 값의 추가 : append, 특정위치삽입 : insert, 특정위치부터 지정 개수만큼 지울때 : delete, 치환 : replace
		// 현재 버퍼의 크기? capacity()
		StringBuffer str2 = new StringBuffer();
		System.out.println("3.str2버퍼크기 : " + str2.capacity());
		str2.append("atom");
		System.out.println("4.str2 : " + str2);
		System.out.println("5.str2 버퍼크기 : " + str2.capacity());
		str2.append("0123456789012345");
		System.out.println("6.str2 버퍼크기 : " + str2.capacity());
		
		str2.insert(2, "abcdefg");
		System.out.println("7.str2 : " + str2);
		System.out.println("8.str2 버퍼크기 : " + str2.capacity());
		
		str2.delete(5, 20);
		System.out.println("9.str2 : " + str2);
		System.out.println("10.str2 버퍼크기 : " + str2.capacity());
		
	}
}
