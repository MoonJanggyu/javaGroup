package t11_interface.t05;

public class Test2Run {
	public static void main(String[] args) {
		// new Test2();
		
		Test2 t22 = new Test2() {
			int ATOM = 20; // 구현클래스안의 변수는 소문자도 가능(atom)
			
			public void abc() {
				int temp = ATOM;
				System.out.println("이곳은 Test2Run클래스의 t22번 익명 객체안의 abc()메소드 입니다.");
				System.out.println("AA = , atom = " + ATOM + ", temp" + temp);
			}
			
		}; // 원래 Test2() 끝에 ();처럼 되야 하는데 그게 생략됬으므로 {}; 와 같이 중괄호 뒤에 넣어준다.
		
		Test2 t23 = new Test2() {
			int ATOM = 40; // 구현클래스안의 변수는 소문자도 가능(atom)
			
			public void abc() {
				int temp = ATOM;
				System.out.println("이곳은 Test2Run클래스의 t23번 익명 객체안의 abc()메소드 입니다.");
				System.out.println("AA = , atom = " + ATOM+", temp" + temp);
			}
			
		};
		
		// 익명 개체 안의 메소드 접근(호출)하기
		t22.abc();   // 메소드는 불러낼 수 있지만, 필드는 부를 수 없음(익명개체안의 필드)
		             // 인터페이스 변수로 익명개체안의 필드와 일반변수는 접근 불가이다.
		// 즉, t22.ATOM은 호출 불가
		t23.abc();
		System.out.println();
		t23.abc();
		System.out.println();
		
		if(t22 == t23) System.out.println("같은 객체를 가리킵니다.");
		else System.out.println("서로 다른 객체를 가리킵니다.");
		// 다른 객체인 이유는 생성시 new 연산자가 붙어서
		
	}
}
