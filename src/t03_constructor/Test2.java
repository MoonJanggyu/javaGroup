package t03_constructor;

public class Test2 {
 // 기본생성자
	Test2(){}
	
	Test2(int su1) {}
	
	Test2(int su1, int su2) {}
	
	Test2(int su1, double su2) {}
	
	Test2(double su1, int su2) {}
	
	// 생성자 오버로딩
	// 생성자는 class와 이름이 같아서 여러개를 생성할 수는 있지만 구분을 주기위해
	// 매개변수의 타입, 갯수, 순서에 따라서 다르게 만들 수 있다(이것들이 겹치면 사용 불가 13번 라인처럼)
}
