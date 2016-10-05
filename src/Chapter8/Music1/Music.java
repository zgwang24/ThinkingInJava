package Chapter8.Music1;

public class Music {
	public static void tune(Instrument i){
		i.play(Note.MIDDLE_C);
	}
	public static void main(String[] args) {
		Wind flute = new Wind();
		tune(flute);
		Instrument flute2 = new Wind();
		tune(flute2);
		Instrument flute3 = new Instrument();
		tune(flute3);
	}
}
