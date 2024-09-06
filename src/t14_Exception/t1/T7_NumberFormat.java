package t14_Exception.t1;

public class T7_NumberFormat {
	public static void main(String[] args) {
		String strNo = "1234";
		String strNo2 = "1234c";
		
		int num = Integer.parseInt(strNo); // 문자(열)을 숫자화
		System.out.println(num + 1000);
		
		try {
			num = Integer.parseInt(strNo2);
			System.out.println(num + 1000);	
		} catch (NumberFormatException e) {
			System.out.println("숫자변환오류 : " +e.getMessage());
		} finally {
			System.out.println("작업끝...");
		}
		
	}

}
