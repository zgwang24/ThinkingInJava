package Chapter6;

class Sundae{
    private Sundae(){
    	System.out.println("Sundae.constructor");
    }
	static Sundae makeASundae(){
		return new Sundae();
	}
}
public class IceCream {
	public static void main(String[] args) {
		// ²»¿É¼û
		// Sundae x = new Sundae();
		Sundae x = Sundae.makeASundae();
	}
}
