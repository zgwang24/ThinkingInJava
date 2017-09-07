package chapter11;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class SimpleCollection {
	public static void main(String[] args) {
		Collection<Integer> c = new HashSet<Integer>();
		for(int i = 0; i < 10; i++){
			c.add(i);
		}
		for(Integer i : c){
			System.out.println(i);
		}
	}
}
