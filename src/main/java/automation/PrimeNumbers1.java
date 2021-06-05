package automation;

public class PrimeNumbers1 {

	public static void main(String[] args) {
		int i = 0;
		int num = 0;
		String primeNumbers = "";

		for (i = 2; i < 1000000; i++) {
			int counter = 0;
			for (num = i; num >= 1; num--) {
				if (i % num == 0) {
					counter++;
				}
			}
			if (counter == 2) {
				primeNumbers = primeNumbers + i + " ";
			}
		}
		System.out.println("Prime numbers from 1 to 1000000 are :");
		System.out.print("  " + primeNumbers + " ");
	}
}
