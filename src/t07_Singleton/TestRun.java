package t07_Singleton;

public class TestRun {
	public static void main(String[] args) {
		
	Singleton mbc =	Singleton.getInstance(); // static이므로 class명으로 호출
	Singleton kbs =	Singleton.getInstance(); // static이므로 class명으로 호출
	Singleton sbs =	Singleton.getInstance(); // static이므로 class명으로 호출
	
	if(mbc == kbs) System.out.println("mbc와 kbs는 같은 서로 같은 객체를 가리키고 있습니다.");
	else System.out.println("mbc와 kbs는 같은 서로 다른 객체를 가리키고 있습니다.");
	
	if(mbc == sbs) System.out.println("mbc와 sbs는 같은 서로 같은 객체를 가리키고 있습니다.");
	else System.out.println("mbc와 sbs는 같은 서로 다른 객체를 가리키고 있습니다.");
	}
}
// DBCP(DataBaseConnectionPool) 를 보완하여 사용하기도 함
