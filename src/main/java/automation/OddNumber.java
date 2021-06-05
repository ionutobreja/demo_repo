package automation;

public class OddNumber {

	public static void main(String[] args) {

		for (int i = 0; i < args.length; i++) {

			int valueToEvaluate = Integer.parseInt(args[i]);

			boolean isOddNumber = isOddNumber(valueToEvaluate);

			System.out.println("Is number " + valueToEvaluate + " odd? " + isOddNumber);
		}
	}

	public static boolean isOddNumber(int number) {
		boolean result = true;
		if (number % 2 != 0) {
			result = true;
			return result;
		}
		return false;

	}
}
