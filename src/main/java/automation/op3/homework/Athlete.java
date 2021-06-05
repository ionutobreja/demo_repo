package automation.op3.homework;

// Is Athlete an Adult? YES
// Athlete is the "child" of Adult and the nephew of "Human" - inherits the "talking" and "breathing" behaviours
public class Athlete extends Adult {

	// The "walking" behaviour is imported from the Child class threw instance "athlete"
	private Child athlete = new Child();

	public void walker() {
		athlete.walk();
	}

	// The "swimming" behaviour is specific JUST for this class
	public void swim() {

	}

}
