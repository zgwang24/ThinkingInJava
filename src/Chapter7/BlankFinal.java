package Chapter7;

class Poppet{
    int i;
	Poppet(int ii){
		i = ii;
	}
}
public class BlankFinal {
	private final int i = 0;
	// Blank final
	private final int j;
	private final Poppet p;
	public BlankFinal(){
		j = 1;
		p = new Poppet(1);
		System.out.println("No args " + j + " " + p);
	}
	public BlankFinal(int x){
		j = x;
		p = new Poppet(x);
		System.out.println("Have args " + j + " " + p);
	}
	public static void main(String[] args) {
		new BlankFinal();
		new BlankFinal(47);
	}
}
