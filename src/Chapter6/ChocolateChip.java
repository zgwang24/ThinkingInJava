package Chapter6;

import Chapter6.section1.*;

public class ChocolateChip extends Cookie{
	public ChocolateChip(){
		System.out.println("ChocolateChip constructor");
	}
	public void chomp(){
		bite();
	}
	public static void main(String[] args) {
		ChocolateChip x = new ChocolateChip();
		x.chomp();
	}
}
