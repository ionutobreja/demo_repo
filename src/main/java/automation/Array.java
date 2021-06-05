package automation;

public class Array {

	public static void main(String[] args) {

		Light[] lights = { new Light(), new Light() };

		System.out.println(lights.length);

		lights[1].brighthen();
		Light bulb = lights[1];
		System.out.print(bulb.getState());

		Light lights2[] = new Light[2];

		lights2[1] = new Light();
		lights2[0] = new Light();

		// System.out.println(lights2[].length);
		System.out.print(lights2[1].getState());

		for (int i = 0; i < lights2.length; i++) {

			System.out.print(lights2[i].getState());
		}

	}

}
