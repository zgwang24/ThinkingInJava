package chapter2;

public class StringTest {
	public static void main(String[] args) {
		String s = "asdf";
		String w = "asdfq";
		String q = new String("asdf");
		System.out.println(s == q);
		System.out.println(s == w);
		System.out.println(s.equals(q));
		System.out.println(s.hashCode());
		System.out.println(q.hashCode());
		char c = 'a';
		Character ch = 'a';
		DataOnly data = new DataOnly();
		data.i = 100;
		data.i = 1000;
		System.out.println(data.i);
		DataOnly data2 = new DataOnly();
		System.out.println(data2.i);
	}
}
