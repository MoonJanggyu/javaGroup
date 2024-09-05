package t10_abstract;

public class Cat extends Animal {
	//talk = "야옹";
	
	public Cat(String talk) {
		this.talk = talk;
	}
	@Override
	public void sound() {
		System.out.println("고양이 울음소리는 "+talk+"~~");
	}

}
