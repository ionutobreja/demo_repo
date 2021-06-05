package automation.excepcions;

public class CathingExcepcions {

	public static void main(String[] args) {

		try {

			int age = Integer.parseInt(args[0]);
			System.out.println(age + 1);
			// do something with age…

		} catch (Throwable ex) {

			System.out.println("First argument needs to be an int " + ex.getMessage());

		}
	}
}
