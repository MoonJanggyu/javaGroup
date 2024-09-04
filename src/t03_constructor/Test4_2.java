package t03_constructor;

// this.   필드 부르기
// this()  생성자 부르기(호출)   다만 타입은 제외하고 매개변수만 기입)
public class Test4_2 {
	String model;
	String color = "블랙";
  int speed;
  
  public Test4_2(String model) {
//  	this.model = model;
//  	this.color = "흰색";
//  	this.speed = 250;
  	this(model, "흰색", 250);
  }
  
  public Test4_2(String model, String color) { // #2
//  	this.model = model;
//  	this.color = color;
//  	this.speed = 250;
  	this(model, color, 250);
  }
  
	public Test4_2(String model, String color, int speed) { // #3
		this.model = model;
		this.color = color;
		this.speed = speed;
  }
}
