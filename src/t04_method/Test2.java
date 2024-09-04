package t04_method;
//메소드 오버로딩(생성자와 비슷한 패턴)
public class Test2 {
	void mod1() {
		System.out.println("안녕1");
	}
	
	void mod1(String name) {
		System.out.println(name + "안녕1");
	}
	
	void mod1(String name, int age) {
		System.out.println(name + "안녕1, 나이는 " + age);
	}
	
	void mod1(int age, String name) {
		System.out.println(name + "안녕1, 나이는 " + age);
	}
	
//	void mod1(String irum, int nai) {
//	System.out.println(name + "안녕1, 나이는 " + age);
//	}
	
//	String mod1(int age, String name) {
//		return (name + "안녕1, 나이는 " + age);
//	}

}
