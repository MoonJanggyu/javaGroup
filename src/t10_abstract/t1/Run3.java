package t10_abstract.t1;

public class Run3 {
	public static void main(String[] args) {
	/*
		Phone	samsungPhone = new Samsung("홍길동");
	samsungPhone.powerOn();
	samsungPhone.sound();
	samsungPhone.function();
	samsungPhone.functionSamsung();
	samsungPhone.powerOff();
	System.out.println();
	
	Phone LgPhone = new Lg("김말숙");
	LgPhone.powerOn();
	LgPhone.sound();
	LgPhone.function();
	LgPhone.functionLg();
	LgPhone.powerOff();
	System.out.println();
	*/
	
	Phone[] phone = {new Samsung("홍길동"), new Lg("김말숙")};
	for(int i=0; i < phone.length; i++) {
		phone[i].powerOn();
		phone[i].sound();
		phone[i].function();
		phone[i].powerOff();
		System.out.println();
	}
	}
}
