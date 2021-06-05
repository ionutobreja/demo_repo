package automation.op3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		testMap();

	}

	public static void testMap() {
		Circle circle1 = new Circle();
		Circle circle2 = new Circle();
		Map<Integer, Circle> map1 = new HashMap<>();
		map1.put(100, circle1);
		map1.put(222, circle2);

		System.out.println(map1.get(100));
		System.out.println(map1.get(222));

		map1.replace(222, null);
		System.out.println(map1.get(222));

		// map1.put(222, circle2);
		// System.out.println(map1.get(222));

		Iterator<Integer> iterator = map1.keySet()
				.iterator();

		while (iterator.hasNext()) {
			int key = iterator.next();
			Circle value = map1.get(key);
			System.out.println("Circle" + value);
		}

	}

}
