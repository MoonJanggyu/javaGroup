package T05_static;

public class Test3 {
// static final String nation = "korea";
// static final String jumin = "123-456";

	 static final String NATION = "korea";
   static final String JUMIN = "123-456";

	public Test3() {}
}
// final을 앞에 붙이면 다음의 2개의 경우만 바꿀 수 있다
// 1. 생성할때 (4번라인)
// 2. 생성할때 아니고 왼쪽(Test2_Run)의 5번 라인
// 즉 매개변수를 받아서 처음 값을 갱신(초기화) 했을 때 

// static final은 선언할 때만 고정가능(즉 2번이 안됨)