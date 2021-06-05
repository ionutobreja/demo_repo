package automation;

public class LeapYears {

	public static void main(String[] args) {

		int year = 2015;

		System.out.println("Number of days of month February:");

		if (year > 1900 && year < 2016) {

			if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {

				System.out.print("For the year " + year + " month February has 29 days ");

			} else {
				System.out.print("For the year " + year + "  month February has 28 days ");
			}
		}

		else {
			System.out.print("The selected year " + year + " is not valid " + ", please select a year that is > 1901 and < 2016");
		}

	}
}
