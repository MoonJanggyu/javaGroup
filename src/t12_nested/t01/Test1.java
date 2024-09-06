package t12_nested.t01;

// 중첩 클래스 : (그중) 인스턴스 멤버클래스

public class Test1 {
	int su = 100;
	
	public Test1() {
		System.out.println("이곳은 Test1 클래스 입니다.");
	}
	
	public void modTest1() {
		int su = 150;
		if(su< 0) {
		//	int su = 200 불가능
			System.out.println("su : " + su);
		}
		System.out.println("이곳은 Test1 클래스의 modTest1 메소드 입니다.");
	}
	
	public class Aa {
		// int su = 200; 가능
		int suA = 200;
		
	 public	Aa() { 
		System.out.println("이곳은 Test1클래스 안의 중첩클래스 Aa의 기본 생성자 입니다.");
	}
	 public void modTest1A() {
		 System.out.println("이곳은 Test1클래스 안의 중첩클래스의 modTest1A 메소드 입니다.");
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
