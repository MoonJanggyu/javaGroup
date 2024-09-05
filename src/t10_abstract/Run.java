package t10_abstract;

public class Run {
	public static void main(String[] args) {
  //new animal(); // 추상 클래스는 생성할 수 없다.
	Dog dog = new Dog("워우~~~");
	dog.sound();
	System.out.println();
	
	Cat cat = new Cat("야옹~~~");
	cat.sound();
	}
}
