package automation;

public class IntegerOperation {

	public static void main(String[] args) {
		int sum = 0;
		for (int n = 0; n < 100; n++) {
			sum += n;
			System.out.println("Suma intermediara " + sum);
		}
		System.out.println(sum);
	}
}