package t18_Collection.t04_Set;

import java.util.HashSet;

/*
 Set계열 : 집합자료구조 - HashSet / TreeSet
 인덱스 정보가 없다. 비순서 자료구조. 중복불허(덮어쓰기됨) 
*/
public class T01_HashSet {
	public static void main(String[] args) {
		//Set<String> hash = new HashSet<String>();
		HashSet<String> hash = new HashSet<>();
		
	  System.out.println("1. 크기 : " + hash.size());
	  System.out.println("1. 내용 : " + hash);
	  System.out.println();
	  
	  // 자료의 추가(add) 비순서자료구조 답게 순서가 뒤죽박죽 (실행해 보면)
	  hash.add("홍길동");
	  hash.add("김말숙");
	  hash.add("이기자");
	  hash.add("소나무");
	  hash.add("강감찬");
	  System.out.println("2. 크기 : " + hash.size());
	  System.out.println("2. 내용 : " + hash);
	  System.out.println();
	  
	  hash.add("홍길동");
	  System.out.println("3. 크기 : " + hash.size());
	  System.out.println("3. 내용 : " + hash);
	  System.out.println();
	  
	  hash.add(new String("홍길동")); // 중복이 안되므로 new 써도 덮어쓰기만 할 뿐
	  System.out.println("4. 크기 : " + hash.size());
	  System.out.println("4. 내용 : " + hash);
	  System.out.println();
	  
	  // 제거(remove)
	  hash.remove("홍길동"); // 인덱스가 아니므로 안에있는 정보(String이므로) "홍길동" 과 같이 로 지운다
	  System.out.println("5. 크기 : " + hash.size());
	  System.out.println("5. 내용 : " + hash);
	  System.out.println();
	  
	  // 추가(add)
	  hash.add("오하늘");
	  System.out.println("6. 크기 : " + hash.size());
	  System.out.println("6. 내용 : " + hash);
	  System.out.println();
	  
	  // 찾고자하는 값의 포함유무? contains()
	  System.out.println("7. '김'씨의 포함 유무? " + hash.contains("김말숙"));
	  System.out.println();
	  
	  // 향상된 for문을 이용한 자료의 출력
	  for(String name : hash ) {
	  	System.out.print(name + "/");
	  }
	    System.out.println("\n");
	    
	  // 람다식 표현 (함수적표현)
	    hash.forEach(name -> {
	      System.out.println("값 : " + name);
	    });
	    System.out.println();
	
	    
	    
	  // 전체삭제 (clear)
	  hash.clear();
	  System.out.println("8. 크기 : " + hash.size());
	  System.out.println("8. 내용 : " + hash);
	  System.out.println();
	  
	  // 비어있는지의 유무? isEmpty()
	  System.out.println("9. 비어있는가? " + hash.isEmpty());
	  
	  
	  
	}
}
