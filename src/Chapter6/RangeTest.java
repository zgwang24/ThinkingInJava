package Chapter6;

import java.util.Arrays;

public class RangeTest {
	public static void main(String[] args) {
		Print.print(Arrays.toString(Range.range(10)));
		Print.print(Arrays.toString(Range.range(10, 20)));
		Print.print(Arrays.toString(Range.range(0, 10, 3)));
	}
}
