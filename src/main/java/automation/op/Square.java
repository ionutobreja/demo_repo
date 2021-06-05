package automation.op;

public class Square {
	private double squareSide;

	public void setSide(double side) {
		squareSide = side;
	}

	public double getArea() {
		return squareSide * squareSide;
	}
}