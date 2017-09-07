package chapter3;

public class Casting {
	public static void main(String[] args) {
		int i = 200;
		long li = (long) i;
		li = i;
		long li2 = (long)200;
		li2 = 200;
		i = (int) li2;
		System.out.println(i);
		System.out.println(li);
		System.out.println(li2);
		System.out.println(i);
	}
}
