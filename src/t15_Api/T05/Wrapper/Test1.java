package t15_Api.T05.Wrapper;

public class Test1 {
	public static void main(String[] args) {
		
	
	int intSu1 = 100, intSu2 = 200;

	// 정수형 Boxing처리 (Integer) - 기본타입(int) 의 참조타입(객체)로 변환
	
	Integer objSu1 = new Integer(intSu1);
	System.out.println("2.objSu1 + 100 " + (objSu1) + 100);
	
	// 자동박싱
	Integer objSu2;
	objSu2 = intSu1;
	System.out.println("3.objSu2 + 100 " + (objSu2 + 100));
	
	// unBoxing처리
	String strIntSu1 = "100";
	System.out.println("4.strIntSu1 + 100 " + (strIntSu1 +100));
	System.out.println("5.strIntSu1 + 100 " + (Integer.parseInt(strIntSu1) +100));
	
	// double <--> Double
	double dblSu = 3.14;
	//Double objDblSu = dblSu; // 이것도 가능(자동박싱)
	Double objDblSu = new Double(dblSu);
	System.out.println("6.objDblSu + 100.5 " + (objDblSu + 100.5) );
	
	// Boxing
	int su3 = 100;
	//Integer objSu3 = su3; 가능(자동박싱)
	Integer objSu3 = Integer.valueOf(su3);
	
	// unBoxing
	int su4 = Integer.valueOf(objSu3);
	System.out.println("su4 + 100 : " + (su4 +100));
	
	}
}
