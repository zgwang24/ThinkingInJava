package chapter3;

public class Literals {
	public static void main(String[] args) {
		int i1 = 0x2f;
		System.out.println("i1: " + Integer.toBinaryString(i1));
		int i2 = 0x2F;
		System.out.println("i2: " + Integer.toBinaryString(i2));
		int i3 = 0177;
		System.out.println("i3: " + Integer.toBinaryString(i3));
		char c = 0xffff;
		System.out.println("c:" + Integer.toBinaryString(c));
		
	}
}
