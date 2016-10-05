package Chapter8.Music1;

import Chapter8.Music1.Note;

class Instrument{
	public void play(Note n){
		System.out.println("Instrument.play()");
	}
}
public class Wind extends Instrument {
	public void play(Note n){
		System.out.println("Wind.play() " + n);
	}
}
