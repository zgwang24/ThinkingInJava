package Chapter11;

import java.util.LinkedList;

public class Stack<T> {
	private LinkedList<T> storage = new LinkedList<T>();
	public void push(T v){
		storage.addFirst(v);
	}
	public T peek(){
		return storage.getFirst();
	}
	public T pop(){
		return storage.removeFirst();
	}
	public boolean empty(){
		return storage.isEmpty();
	}
	public String toString(){
		return storage.toString();
	}
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		for(String s : "My dog has fleas".split(" ")){
			stack.push(s);
		}
		while(!stack.empty()){
			System.out.print(stack.pop() + " ");
		}
	}
}
