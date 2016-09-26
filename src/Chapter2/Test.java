package Chapter2;

public class Test {
	public static void main(String[] args) {
		StaticTest t1 = new StaticTest();
		StaticTest t2 = new StaticTest();
		System.out.println(t1.i == t2.i);
	}
}
