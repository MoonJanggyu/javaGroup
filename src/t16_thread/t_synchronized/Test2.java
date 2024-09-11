package t16_thread.t_synchronized;

// 공유객체
class MyData2 {
	int data = 10;
	
	// 스레드 메소드 동기화(synchronized)
	public synchronized void plusMethod() {
		int mydata2 = data;
		try {Thread.sleep(1000);} catch (InterruptedException e) {}
		data	= mydata2 + 1;
	}
}

// 공유객체를 사용하는 스레드
class useMydata2 extends Thread{
	MyData2 myData2;
	
	public useMydata2(MyData2 myData2) {
		this.myData2 = myData2;
	}
	
	@Override
	public void run() {
		myData2.plusMethod();
		System.out.println(getName() + "실행결과 : " + myData2.data);
	}
}

public class Test2 {
	public static void main(String[] args) {
		MyData2 myData2 = new MyData2();
		
		Thread th1 = new useMydata2(myData2);
		th1.start();
		
		Thread th2 = new useMydata2(myData2);
		th2.start();
		
		Thread th3 = new useMydata2(myData2);
		th3.start();
	}
}
