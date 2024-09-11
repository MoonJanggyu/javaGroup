package t18_Collection.t06_Stack_Queue;

// Queue는 FIFO 방식 (First In First Out) 선입선출법 
// 예외처리 포함
import java.util.LinkedList;
import java.util.Queue;

public class T02_Queue2 {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		
		System.out.println("1. 크기 : " + queue.size());
		System.out.println("1. 내용 : " + queue);
		System.out.println();
		
		// 삽입 : offer (이 명령어 사용시 바로아래 보기는 peek)
		queue.offer(30);
		queue.offer(33);
		queue.offer(23);
		queue.offer(16);
		queue.offer(26);
		
		System.out.println("2. 크기 : " + queue.size());
		System.out.println("2. 내용 : " + queue);
		System.out.println();
		
		// 바로 아래자료 쳐다보기 peek
		System.out.println("3.바로 아래 자료 : " + queue.peek());
		System.out.println();
		
		// 꺼내기 : poll()
		queue.poll();
		queue.poll();
		queue.poll();
		queue.poll();
		queue.poll();
		queue.poll();
		System.out.println("4. 크기 : " + queue.size());
		System.out.println("4. 내용 : " + queue);
		System.out.println();
		queue.poll();
	}
}
