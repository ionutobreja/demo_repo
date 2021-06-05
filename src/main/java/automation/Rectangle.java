package automation;

/**
 * 
 * @author bunge
 *
 */
public class Rectangle {

	public static void main(String[] args) {

		// drawFullShape(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		// drawShapeOutline(4, 5);
		// drawShapeCorners(4, 5);
		short lenght = 4;
		drawSquaire(lenght);
		// drawSquaire((short) 5);
	}

	/**
	 * @param lenght
	 */
	public static void drawSquaire(int lenght) {

		for (int i = 1; i <= lenght; i++) {

			for (int j = 1; j <= lenght; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	/**
	 * @param lenght
	 */
	public static void drawSquaire(short lenght) {

		for (int i = 1; i <= lenght; i++) {

			for (int j = 1; j <= lenght; j++) {
				System.out.print("$ ");
			}
			System.out.println();
		}

	}

	/**
	 * @param height
	 * @param width
	 */
	public static void drawFullShape(int height, int width) {

		for (int i = 1; i <= height; i++) {

			for (int j = 1; j <= width; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	/**
	 * @param height
	 * @param width
	 */
	public static void drawShapeOutline(int height, int width) {

		for (int i = 1; i <= height; i++) {

			for (int j = 1; j <= width; j++) {

				if (i == 1 || i == height || j == 1 || j == width)
					System.out.print("* ");
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

	/**
	 * @param height
	 *        The height of the rectangle
	 * 
	 * @param width
	 */
	public static void drawShapeCorners(int height, int width) {

		for (int i = 1; i <= height; i++) {

			for (int j = 1; j <= width; j++) {
				if (i == 1 && j == 1 || i == 1 && j == width || i == height && j == 1 || i == height && j == width)

					// if ((i == 1 || i == height) && (j == 1 || j == width))
					System.out.print("* ");
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
