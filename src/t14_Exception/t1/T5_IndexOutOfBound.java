package t14_Exception.t1;

public class T5_IndexOutOfBound {
	public static void main(String[] args) {
		int[] array = {1,2,3};
		for(int i=0;i<=array.length;i++) {
			try {
				System.out.println(i+"번째 : " + array[i]);				
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("철자 오류 : " + e.getMessage());
			}
			
		}
		System.out.println("작업끝");
	}
}
