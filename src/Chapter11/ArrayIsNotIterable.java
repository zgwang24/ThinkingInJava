package Chapter11;

import java.util.Arrays;

public class ArrayIsNotIterable {
	static<T> void test(Iterable<T> ib){
		for(T t : ib){
			System.out.print(t + " ");
		}
	}
	public static void main(String[] args) {
		// int[] arrs = {4, 5, 6};
		// test(arrs);
		test(Arrays.asList(1, 2, 3));
		String[] strings = {"A", "B", "C"};
		// test(strings);
		test(Arrays.asList(strings));
	}
}
