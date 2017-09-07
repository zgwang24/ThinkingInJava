package chapter11;

import java.util.Iterator;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

class PetSequence{
	protected Pet[] pets = Pets.createArray(8);
}
public class NonCollectionSequence extends PetSequence{
	public Iterator<Pet> iterator(){
		return new Iterator<Pet>(){
			private int index = 0;
			@Override
			public boolean hasNext() {
				return index < pets.length;
			}
			@Override
			public Pet next() {
				return pets[index++];
			}
			
		};
	}
	public static void main(String[] args) {
		NonCollectionSequence nc = new NonCollectionSequence();
		InterfaceVsIterator.display(nc.iterator());
	}
}
