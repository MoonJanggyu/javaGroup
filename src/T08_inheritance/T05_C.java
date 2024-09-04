package T08_inheritance;

public class T05_C extends T05_P {

	@Override
	void areaCircle(int r) {
		// TODO Auto-generated method stub
		super.areaCircle(r);
	}
	
	

}
		
	  // 이 경우를 override 했다고 하며 '재정의'라고 한다.
   // 즉, 부모가 가진 메소드를 자식class에 가져와서 조금만 바꿔서 사용
    // 오버로딩과 달리 오버라이딩은 메소드만 재정의 (생성자 x)
// 무조건 부모것 가지고 오면, 고쳤든 안고쳤든 무조건 override 했다고 본다
// 내용 즉 중괄호 안에 아무것도 안가져오고 앞에 것만 가져와도 override
// 즉 12번 라인의 경우, 부모의 void~ 이하 와 자식의 void~ 이하 가 일치하면
// 부모가 아닌 자식것을 실행시킴(이것뿐만아니라 자식것이 기본임)
// 즉 오버라이드의 선언부가 같아야 override로 침
// 선언부를 고치면 안됨 ( 타입이 중요 // 변수명은 바꿔도 상관 x)

// 컴파일러와의 약속인 어노테이션을 쓰면 선언부가 바뀌면 붉은색으로 표시