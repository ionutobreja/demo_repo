package automation;

public class Light {

	private boolean state;
	private byte intensity = 10;

	public void turnOn() {
		this.state = true;
	}

	public void turnOff() {
		this.state = false;
	}

	public boolean getState() {
		return state;
	}

	public void setIntensity(byte intensity) {

		if (intensity > 0 || intensity < 10) {
			return;
		}

		this.intensity = intensity;

		// if (intensity > 0 || intensity < 10) {
		// this.intensity = intensity;}
	}

	public void dim() {

		if (intensity > 0)
			intensity--;

		if (intensity == 0) {
			turnOff();
		}

	}

	public void brighthen() {

		if (intensity < 10) {
			intensity++;
		}

		if (intensity == 1) {
			turnOn();
		}
	}
}
