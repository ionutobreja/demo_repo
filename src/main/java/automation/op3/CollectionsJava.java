package automation.op3;

import java.util.ArrayList;
import java.util.List;

public class CollectionsJava {
	public static void main(String[] array) {
		parameterList();

	}

	public static void parameterList() {

		Circle circle = new Circle();
		circle.setColor("blue");

		List<Circle> list = new ArrayList<Circle>(2);
		// System.out.println(list.size());

		list.add(circle);
		list.add(new Circle());
		list.add(circle);
		list.add(1, circle);

		System.out.println(list.size());
		System.out.println(list.get(1));
		System.out.println(list.get(2));

	}

	public static void rawList() {

		List list = new ArrayList();

		list.add("list element");
		list.add("another list element");
		list.add(7);
		list.add(new Circle());

		Object secondElement = list.get(2);
		if (secondElement instanceof String) {

			String firstElement = (String) secondElement;
			String firstSub = firstElement.substring(1);
			System.out.println(firstSub);

		} else

		if (secondElement instanceof Circle) {

			Circle firstElement = (Circle) secondElement;
			// firstElement.draw();
			System.out.println(firstElement.draw());

		}

	}
}
