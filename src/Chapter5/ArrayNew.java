package Chapter5;

import java.util.Arrays;
import java.util.Random;

public class ArrayNew {
	public static void main(String[] args) {
		int[] a;
		Random rand = new Random(67);
		a = new int[rand.nextInt(90)];
		System.out.println(a.length);
		System.out.println(Arrays.toString(a));
	}
}
