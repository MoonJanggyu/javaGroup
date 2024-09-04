package T05_static;

// import t04_method.Test5;
// import t04_method.Test6;  //이 두가지 합치기 가능

import t04_method.*; // import에서 쓰는 *는 와일드카드(4번 패키지 안 모든 것 가져옴)

// ctrl+shift+o 는 자동으로 import 걸어줌

public class Test4_Run {
	public static void main(String[] args) {
		Test4 t4 = new Test4();
		t4.mod1();
		
//		new t04_method.Test6();
		new Test6();
		// new t04_method.Test6(); 도 가능하고
		// ctrl 로 Test6 눌러서 import (3번 라인)문 걸기도 가능
		new Test5(5);
		new t04_method.Test4();
		
	}
}
