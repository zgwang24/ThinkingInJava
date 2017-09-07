package chapter7;

class Insturment {
	public void play(){
		System.out.println("Upcasting");}
	static void tune(Insturment i){
		i.play();
	}
}
public class Wind extends Insturment{
	public static void main(String[] args) {
		Wind flute = new Wind();
		// Upcasting
		Insturment.tune(flute);
	}
}
