package t11_interface.t01.t1;

public class Tank implements toy {
	private int age=13; // 숙제

	@Override
	public void age() {
		System.out.println(age + "세 이상만 사용하실 수 있습니다.");
	}

	@Override
	public void moving() {}

	@Override
	public void fire() {
		System.out.println("레이저빔 발사기능이 있습니다.");
	}

	@Override
	public void misalle() {
		System.out.println("미사일 발사기능이 있습니다.");
	}

	@Override
	public int possibleAge() {
		return age;
	}

	@Override
	public void product(String name) {
		System.out.println("장난감 이름 : " + name);
	}

}
