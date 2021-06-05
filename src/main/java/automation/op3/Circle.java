package automation.op3;

public class Circle extends Shape {

	@Override
	public String draw() {
		return "drawingAcircle";

	}

	@Override
	public String toString() {
		return "Circle of colour:" + this.getColor();
	}
}
