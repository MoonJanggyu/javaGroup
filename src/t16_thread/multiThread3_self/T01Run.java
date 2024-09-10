package t16_thread.multiThread3_self;

public class T01Run {
	public static void main(String[] args) {
		// 자막객체 생성 실행
		Thread smiThread = new SMIFile();
		smiThread.start();
		
		// 영상객체 생성 실행
		Thread screenThread = new ScreenFile();
		screenThread.start();
	}
}

// 영상을 처리하는 클래스 생성
class ScreenFile extends Thread{
	@Override
	public void run() {
	// #1. 영상프레임 1~5컷트
		int [] screenArray = {1,2,3,4,5};

	// #3. 영상출력
			for(int i=0; i<screenArray.length; i++) {	
				System.out.print("영상프레임 : " + screenArray[i]);
				try {Thread.sleep(500);} catch (InterruptedException e) {}
	}
}
}
// 자막을 처리하는 클래스
class SMIFile extends Thread {
	@Override
	public void run() {
	// #2. 각 프레임 표시될 자막
	String [] smiArray = {"하나", "둘", "셋", "넷", "다섯"};
	try {Thread.sleep(10);} catch (InterruptedException e) {}
  // #4. 자막출력
		for(int i=0; i<smiArray.length; i++) {
			System.out.println(" - 자막출력 : " + smiArray[i]);	
			try {Thread.sleep(500);} catch (InterruptedException e) {} // 밀리세컨드 그리고 스레드는 무조건 예외처리
		}
}
}