package t14_Exception.t1;

public class T6_NullPoint {
	public static void main(String[] args) {
		String str = "Seoul";
		String str2 = null;
		
		System.out.println("o : " + str.charAt(2));
		
		try {
			System.out.println("o : " + str2.charAt(2));			
			System.out.println("정상처리");
		} catch (NullPointerException e) {
			System.out.println("Null값 오류" + e.getMessage());
		} finally {
			System.out.println("작업끝....");
		}
	}
}
