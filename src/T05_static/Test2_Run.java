package T05_static;

public class Test2_Run {
	public static void main(String[] args) {
	Test2 t2 = new Test2("222-555");
	System.out.println("nation : " + t2.nation);
	
	
	// t2.nation = "USA"; final 붙어서 안됨
	// System.out.println("nation : " + t2.nation);
	
  // t2.jumin = "123-456";
	System.out.println("jumin : " + t2.jumin);
	}
}
