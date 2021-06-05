package automation.op3;

public class Rectangle extends Shape {

	private int largeSide;
	private int smallSide;

	@Override
	public String draw() {
		return "drawingArectangle";

	}

	public int getLargeSide() {
		return largeSide;
	}

	public void setLargeSide(int largeSide) {
		if (largeSide > 0) {
			this.largeSide = largeSide;
		}

	}

	public int getSmallSide() {
		return smallSide;
	}

	public void setSmallSide(int smmallSide) {
		if (smallSide > 0) {
			this.smallSide = smmallSide;
		}

	}

	public double getArea() {
		return smallSide * largeSide;
	}

}
