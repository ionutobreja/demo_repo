package automation.op;

public class Shape {

	// public static void main(String[] args) {
	//
	// Square sq = new Square();
	// sq.setSide(Double.parseDouble(args[0]));
	//
	// System.out.print(sq.getArea());
	// }
	//
	// }

	public static void main(String[] args) {

		Square sq = new Square();

		for (String side : args) {

			sq.setSide(Double.parseDouble(side));
			System.out.println("Area is " + sq.getArea());
		}

	}
}
