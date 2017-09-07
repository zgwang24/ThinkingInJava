package chapter11;

import java.util.ArrayList;

public class ApplesAndOrangesWithGenerics {
	public static void main(String[] args) {
		ArrayList<Apple> apples = new ArrayList<Apple>();
		for(int i = 0; i < 3; i++){
			apples.add(new Apple());
		}
		for(int i = 0; i < apples.size(); i++){
			System.out.println(apples.get(i).id());
		}
		for(Apple a : apples){
			System.out.println(a.id());
		}
	}
}
