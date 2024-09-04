package T05_static;

public class Test1_Run {
	public static void main(String[] args) {
   	Test1 t1 = new Test1();
	  System.out.println("t1.su : " + t1.su);
		t1.add(50, 100); // 에러는 아니지만 바람직하지 않음
	  
		System.out.println("su : " + Test1.su);
		// 자주 사용하는 것만 메소드영역에 올리기위해 사용
		// 너무 사용하지 않도록
		Test1.add(100,200);
		
	}
}
