package t12_nested.t02;

// 중첩 클래스 : 정적 멤버 클래스
public class Test1 {
	int su = 300;
	
	public Test1() {
		System.out.println("이곳은 Test1 클래스 입니다.");
	}
	
	public void modTest1() {
		System.out.println("이곳은 Test1 클래스의 modTest1 메소드 입니다.");
	}
	
	// 여기서부터가 중첩 클래스
	public static class Aa {
		int suA = 400;
		static int suB = 450;
	 
		public Aa() { 
		System.out.println("이곳은 Test1클래스 안의 중첩클래스 Aa의 기본 생성자 입니다.");
	}
	 public void modTest1A() {
		 System.out.println("이곳은 Test1클래스 안의 중첩클래스의 modTest1A() 메소드 입니다.");
	 }
	 public static void modTest1B() {
		 System.out.println("이곳은 Test1클래스 안의 중첩클래스의 modTest1B() 메소드 입니다.");
	 }
	}
	
	public class Bb {
		
	}
	
}

// 위의 중첩클래스 Aa와는 다름 (그래서 생성가능)
class Aa {
	public Aa() {
		System.out.println("이곳은 Aa클래스 입니다.");
 }
}
