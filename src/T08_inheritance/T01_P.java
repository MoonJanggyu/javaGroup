package T08_inheritance;

// 부모 클래스 (가장 꼭대기 클래스는 object class - 모든 상속의 끝(최상위 부모))
public class T01_P  extends T01_J
{
	int money = 1000;
 
	void mod1(String temp) {
		System.out.println(temp);
	}


// 절대값 메소드
int absMod(int su) {
	int res = (su>0) ? su : su * (-1) ; // 3항 연산자  ()? __ :  __ ;
	return res; 
 }
}