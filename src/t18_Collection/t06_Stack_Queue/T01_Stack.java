package t18_Collection.t06_Stack_Queue;

import java.util.Stack;

/*
  스택 : LIFO(Last In First Out) - 후입선출법
*/
public class T01_Stack {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		
		System.out.println("1. 크기 : " + stack.size());
		System.out.println("1. 내용 : " + stack);
		System.out.println();
		
		
		// 삽입(push)
		stack.push(2);
		stack.push(4);
		stack.push(3);
		stack.push(9);
		stack.push(6);
		System.out.println("2. 크기 : " + stack.size());
		System.out.println("2. 내용 : " + stack);
		System.out.println();
		
		// 검색(search)  후입선출이므로 뒤에 들어간 순서(즉 뒤에서 2번째가 key 9)
		System.out.println("3. 검색(9) : " + stack.search(9));
		System.out.println();
		
		// 바로 아래 자료 쳐다보기 : peek()
		System.out.println("4. : " + stack.peek());
		System.out.println();
		
		
		// 꺼내기(pop)   제일 마지막에 들어간 6이 출력되어 없고 나머지만 존재
		stack.pop();
		System.out.println(". 크기 : " + stack.size());
		System.out.println(". 내용 : " + stack);
		System.out.println();
	}
}
