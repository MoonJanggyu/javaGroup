package T09_polymorphism.T1;

public class T2Run {
	public static void main(String[] args) {
		Aa aa = new Aa();
	// 강제 타입변환은 (부모 -> 자식) 은 바로는 안되고 자식 -> 부모 -> 자식 이 가능
	//	Cc cc = a1; // 처음부터 부모객체가 자식객체로 타입변환 될 수는 없다.
	//  부모객체가 자식객체로 타입변환을 하기 위해서는 무조건 자식객체가 부모타입으로 변환했을 때만 가능하다.(강제 Casting)	
		
		Bb bb = new Bb();
		System.out.println("su : " +bb.su);
		Aa a1 = bb;
		System.out.println("su : " +a1.su);
		System.out.println();
		
		Bb b1 = (Bb)a1; // 강제 casting 때는 여기서처럼 앞에 (Bb) 처럼 강제 타입 변환 필요
		System.out.println("su : " +b1.su);
		System.out.println();
		
		Aa a2 = new Dd();
		System.out.println("su : " +a2.su);
		System.out.println();
		
		Dd d1= (Dd)a2;
		System.out.println("su : " +d1.su);
		System.out.println();
		
		Bb b2=(Bb)a2;
		System.out.println("su : " +b2.su);
		System.out.println();
		
	
		
	//	Cc객체가 Aa로 타입 변화된적이 없기에, a2객체는 Cc객체로 타입변화 불가하다. (컴파일상에서는 에러가 발생하지 않는다. 다만 실행오류는 나온다)
	//	Cc c1 = (Cc)a2;
  //	System.out.println("su : " +c1.su);
	//	System.out.println();
		
		//  instanceof : 과거에 부모객체로 타입 변환이 되었었는지를 알아보는 연산자(true / false)
		
		
		// override적용시
		Aa a3 = new Bb(); // up casting
		System.out.println("4.su : " + a3.su);
		a3.modAa();
		System.out.println();
		
		Bb b3 = (Bb) a3; // down casting
		System.out.println("5.su : " + b3.su);
		
		
		b3.modAa(); // 자식이 우선이므로 Bb쪽 메소드
		
		
		}
}
