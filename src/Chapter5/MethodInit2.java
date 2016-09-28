package Chapter5;

public class MethodInit2 {
	int i = f();
	int j = g(i);
	int f(){
		return 11;
	}
	int g(int n){
		return n * 10;
	}
	public static void main(String[] args) {
		MethodInit2 m1 = new MethodInit2();
		System.out.println(m1.i);
		System.out.println(m1.j);
		
	}
}
