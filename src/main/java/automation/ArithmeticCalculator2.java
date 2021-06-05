package automation;

public class ArithmeticCalculator2 {

	public static void main(String[] args) {

		if (args.length == 3) {

			double a = Double.parseDouble(args[0]);

			double b = Double.parseDouble(args[2]);

			double result;

			String operator = args[1];

			switch (operator) {

			case "+":

				result = a + b;
				System.out.println("Result is: " + result);
				break;

			case "-":

				result = a - b;
				System.out.println("Result is: " + result);
				break;

			case "*":

				result = a * b;
				System.out.println("Result is: " + result);
				break;

			case "/":

				result = a / b;
				System.out.println("Result is: " + result);
				break;

			}

		} else {

			System.err.println("3 arguments are needed!");

		}
	}
}
