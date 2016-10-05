package Chapter9;

import Chapter8.Music1.Note;

interface Instrument1{
	// static & final
	int VALUE = 5;
	void play(Note n);
	void adjust();
}
class Wind1 implements Instrument1{
	@Override
	public void play(Note n) {
		System.out.println(this + ".play() " + n);
	}
	public String toString(){
		return "Wind1";
	}
	@Override
	public void adjust() {
		System.out.println(this + ".adjust()");
	}
}

class Percussion1 implements Instrument1{
	@Override
	public void play(Note n) {
		System.out.println(this + ".play() " + n);
	}
	public String toString(){
		return "Percussion1";
	}
	@Override
	public void adjust() {
		System.out.println(this + ".adjust()");
	}
}

class Stringed1 implements Instrument1{
	@Override
	public void play(Note n) {
		System.out.println(this + ".play() " + n);
	}
	public String toString(){
		return "Stringed1";
	}
	@Override
	public void adjust() {
		System.out.println(this + ".adjust()");
	}
}

class Brass1 extends Wind1{
	public String toString(){
		return "Brass1";
	}
}

class Woodwind1 extends Wind1{
	public String toString(){
		return "Woodwind1";
	}
}

public class Music5 {
	static void tune(Instrument1 i){
		i.play(Note.MIDDLE_C);
	}
	static void tuneAll(Instrument1[] e){
		for(Instrument1 i : e){
			tune(i);
		}
	}
	public static void main(String[] args) {
		Instrument1[] orchestra = {
			new Wind1(),
			new Percussion1(),
			new Stringed1(),
			new Brass1(),
			new Woodwind1()
		};
		tuneAll(orchestra);
	}
}
