package t16_thread.multiThread1;

public class T01Run {
	public static void main(String[] args) {
		System.out.println("현재 클래스명 : T01Run");
		System.out.println("현재 스레드명 : " + Thread.currentThread().getName());
		System.out.println();
		
		Thread th1 = new T01();
		th1.start(); // thread는 한번 밖에 실행 못함(즉 start는 한번만됨 여러번하려면 다른 스레드를 줘야함)
		
		try {Thread.sleep(2000); } catch (InterruptedException e) {}
		System.out.println("-----------------------------------------------");
		System.out.println("현재 클래스명 : T01Run");
		System.out.println("현재 스레드명 : " + Thread.currentThread().getName());
		System.out.println("-----------------------------------------------");
	}
}


class T01 extends Thread {
	@Override
	public void run() {
		System.out.println("1.현재 클래스명 : T01");
		System.out.println("1.현재 실행중인 스레드명? " + Thread.currentThread().getName());
		
		//for(long i=0; i<1000000000; i++) {}
		for(int i=1; i<=5; i++) {
			System.out.println("i = " + i );
			try {Thread.sleep(500); } catch (InterruptedException e) {}
		}
		
		
		System.out.println("2.현재 클래스명 : T01");
		System.out.println("2.현재 실행중인 스레드명? " + Thread.currentThread().getName());
		System.out.println("2. " + Thread.currentThread().getName() + " 스레드가 종료 됩니다. ");
	}
}