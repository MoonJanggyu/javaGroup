package t03_constructor;

public class Test3Run {
	public static void main(String[] args) {
		new Test3();
		System.out.println();
		
		new Test3(500);
		System.out.println();
		
		new Test3(3.14);
		System.out.println("====================");
		
		Test3 t3_1 = new Test3();
		System.out.println("1 : " + t3_1.atom1);
		
		Test3 t3_2 = new Test3();
		System.out.println("2 : " + t3_2.atom1);
		
		System.out.println("=======================");
		
		Test3 t33 = new Test3(1234);
		t33.atom1 = 4321;
		System.out.println("5 : " + t33.atom1);
	}
}
