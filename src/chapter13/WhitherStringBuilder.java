package chapter13;

public class WhitherStringBuilder {
	public static String implicit(String[] fields){
		String result = "";
		for(int i = 0; i < fields.length; i++){
			result += fields[i];
		}
		return result;
	}
	public static String explicit(String[] fields){
		StringBuilder result = new StringBuilder();
		for(int i = 0; i < fields.length; i++){
			result.append(fields[i]);
		}
		return result.toString();
	}
	public static void main(String[] args) {
		String[] fields = {"abc", "DEF"};
		System.out.println(implicit(fields));
		System.out.println(explicit(fields));
	}
}
