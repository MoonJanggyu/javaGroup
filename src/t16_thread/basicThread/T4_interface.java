package t16_thread.basicThread;

// 2. Runnable 인터페이스 구현 방식   8 9번 라인이 특히 중요
public class T4_interface {
	public static void main(String[] args) {
		System.out.println("스레드명 : " + Thread.currentThread().getName());
	//	MyThread2 mt2 = new MyThread2();
		Runnable mt2 = new MyThread2();   // 3. runnable 구현 객체 생성
		Thread th1 = new Thread(mt2);     // 4. Thread객체를 생성하면서 Runnable 객체 변수를 매개값으로 대입!
		th1.start();                      // 5. start()메소드를 실행한다.
	}
}

class MyThread2 implements Runnable {  // 1. Runnable 인터페이스 구현하는 클래스를 정의

	@Override
		public void run() {  // 2. Run() 메소드를 오버라이드(override)하여 수행할 스레드 코드를 작성한다.
			System.out.println("스레드명 : " + Thread.currentThread().getName());
	}
	
}