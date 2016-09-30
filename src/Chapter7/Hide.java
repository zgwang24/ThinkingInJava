package Chapter7;

class Homer{
	char doh(char c){
		System.out.println("doh(char)");
		return 'd';
	}
	float doh(float f){
		System.out.println("doh(float)");
		return 1.0f;
	}
}
class Milhouse{}

class Bart extends Homer{
	@Override
	float doh(float f){
		System.out.println("doh(float)1");
		return 1.0f;
	}
	void doh(Milhouse m){
		System.out.println("doh(Milhouse)");
	}
}

public class Hide {
	public static void main(String[] args) {
		Bart b = new Bart();
		b.doh(1);
		b.doh('x');
		b.doh(1.0f);
		b.doh(new Milhouse());
		Homer h = new Bart();
		h.doh(2.0f);
	}
}
