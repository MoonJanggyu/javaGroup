package t12_nested.t02;

public class Test1Run {
	public static void main(String[] args) {
	 Test1 t1 = new Test1();
	 System.out.println("Test1 클래스의 su필드 : " + t1.su);
	 t1.modTest1();
	 System.out.println();
	 
	 Test1.Aa t1a= new Test1.Aa();
	 System.out.println("중첩클래스안의 suA필드 : " + t1a.suA);
	 t1a.modTest1A();
	 System.out.println();
	 
	 System.out.println("중첩클래스안의 suA필드 : " + Test1.Aa.suB);
	 // 이번(static class를 부를 때)에는 10번라인과 15번라인이 중요
	 Test1.Aa.modTest1B();
	
	}
}
