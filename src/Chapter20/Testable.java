package Chapter20;

import chapter20.annotation.Test;

public class Testable {
	public void execute(){
		System.out.println("Executing...");
	}
	@Test void testExecute(){
		execute();
	}
}
