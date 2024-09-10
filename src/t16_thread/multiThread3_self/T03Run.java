package t16_thread.multiThread3_self;

public class T03Run {
	public static void main(String[] args) {
		// 자막을 출력하는 스레드를 '익명 inner 클래스'로 구현한다.
		Thread smiTh1 = new Thread(new Runnable() {

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
			
		});
		
		//영상을 출력하는 스레드를 익명 inner 클래스로 구현
		Thread smiTh2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// #1. 영상프레임 1~5컷트
				int [] screenArray = {1,2,3,4,5};

			// #3. 영상출력
					for(int i=0; i<screenArray.length; i++) {	
						System.out.print("영상프레임 : " + screenArray[i]);
						try {Thread.sleep(1000);} catch (InterruptedException e) {}
					}
	
					
			}
		});
		// 앞에서 생성시켜놓은 익명 inner 클래스를 실행한다.
		smiTh1.start();
		smiTh2.start();
		}
}
	
		
					
	
			
		
		



