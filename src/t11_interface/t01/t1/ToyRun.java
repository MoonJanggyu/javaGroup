package t11_interface.t01.t1;

public class ToyRun {	
	public static <Toy> void main(String[] args) {
		//숙제 (입력받아서)
		System.out.println("연령별 장난감 기능 현황");
		
		Toy beer = new Beer();
		Toy robot = new Robot();
		Toy tank = new Tank();
		Toy airplane = new AirPlane();

		Toy[] toy = {beer, robot, tank, airplane};
		String[] title = {"곰돌이", "로보트", "탱크", "비행기"};
		
		for(int i=0; i<toy.length;i++)
			toy[i].product(title[i]);
		  toy[i].age();
		  toy[i].mvoing();
		  toy[i].fire();
		  toy[i].missle();
		  System.out.println();
	}
}
