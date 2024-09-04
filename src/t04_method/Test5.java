package t04_method;

public class Test5 {
	int volume;
	
	public Test5(int volume) {
		this.volume=volume;  // 생성자
	}
	
	void volumeUp() {
		if(volume < 10) volume++;
		volumePrint();
	}
	void volumeDown() {
		if(volume > 0) volume--;
		volumePrint();
	}
	
	void volumePrint() {
		System.out.println("현재 volume : " + this.volume);
	}
}


// 기본소리 : 5 (생성자를 통해)
// 소리조절 : +- 입력
// 최소 0 이고 큰것은 10까지만
// + 누를 시 볼륨 업         11~13의 3개의 메소드 필요 
// - 누를 시 볼륨 다운
// 현재 볼륨 출력