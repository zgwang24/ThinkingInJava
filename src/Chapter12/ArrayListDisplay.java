package Chapter12;

import java.util.ArrayList;

public class ArrayListDisplay {
	public static void main(String[] args) {
		String[] sa = {"abc", "def", "hij"};
		ArrayList<String> strings = new ArrayList<String>();
		for(String s : sa){
			strings.add(s);
		}
		System.out.println(strings);
	}
}
