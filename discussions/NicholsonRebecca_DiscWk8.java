//Rebecca Nicholson / June 15, 2023 / This program creates a dishwasher class and runs the dishwasher.
package CMIS141;

public class NicholsonRebecca_DiscWk8 {

	public static class Dishwasher {
		private static String color;
		private static String brand;

		public Dishwasher(String color, String brand) {
			Dishwasher.color = color;
			Dishwasher.brand = brand;
		}

		public void washDishes(String startWasher) {
			if (startWasher.equalsIgnoreCase("Yes")) {
				System.out.println("The " + brand + " dishwasher is currently running.");
			} else if (startWasher.equalsIgnoreCase("No")) {
				System.out.println("The Dishwasher was not turned on.");
			} else {
				System.err.println("That was not a valid entry");
				System.exit(1);
			}

		}

		public static void displayAttributes() {
			System.out.println();
			System.out.println("APPLIANCE DETAILS: ");
			System.out.println("Color: " + color);
			System.out.println("Brand: " + brand);
		}

		public static void main(String[] args) {
			Dishwasher newDishwasher = new Dishwasher("Stainless Steel", "Samsung");

			newDishwasher.washDishes("Yes");
			displayAttributes();
		}
	}
}
