package t10_abstract.t1;

public class Run1 {
	public static void main(String[] args) {
	Samsung	samsungPhone = new Samsung("홍길동");
	samsungPhone.powerOn();
	samsungPhone.sound();
	samsungPhone.function();
	samsungPhone.functionSamsung();
	samsungPhone.powerOff();
	System.out.println();
	
	Lg LgPhone = new Lg("김말숙");
	LgPhone.powerOn();
	LgPhone.sound();
	LgPhone.function();
	LgPhone.functionSamsung();
	LgPhone.powerOff();
	System.out.println();
	}
}
