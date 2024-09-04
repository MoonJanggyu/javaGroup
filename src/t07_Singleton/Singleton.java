package t07_Singleton;

public class Singleton {

	// 2. 정적필드(자신의 객체타입)를 선언, 초기값으로 객체를 생성 시킴,  private 붙이기
	private static Singleton singleton = new Singleton();
	
	// 1. 객체를 외부에서 생성하지 못하도록 -> 생성자를 만들긴하되 앞을 private으로
	private Singleton() {}
	
	// 3. 외부에서 호출하여 사용할 수 있는 정적메소드(getter)를 만든다.
	static Singleton getInstance() {
		return singleton;
	}
}
