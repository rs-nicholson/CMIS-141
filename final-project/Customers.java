//Rebecca Nicholson / June 15, 2023 / This program prompts user selection and then runs selected program
package CMIS141;

import java.util.Scanner;

public class Customers {

	private static final int maxCustomers = 100;
	static String[] customerNames;
	static int[] customerIDs;
	static double[] customerSales;
	static int customerCount;

	public Customers() {
		customerNames = new String[maxCustomers];
		customerIDs = new int[maxCustomers];
		customerSales = new double[maxCustomers];
		customerCount = 0;
	}

	public static void showMenu() {
		// provide menu options
		System.out.println("MENU");
		System.out.println("1: Add multiple new customers");
		System.out.println("2: Add single new customer");
		System.out.println("3: Display all customers");
		System.out.println("4: Retrieve specific customer's data");
		System.out.println("5: Retrieve customers with orders based on range");
		System.out.println("9: Exit program");
		System.out.println();
	}

	public static void addCustomer(String name, int customerID, double sales) {
		customerNames[customerCount] = name;
		customerIDs[customerCount] = customerID;
		customerSales[customerCount] = sales;
		customerCount++;
	}

	public static void addSingleCustomer(Scanner scanstr, Scanner scanint, Scanner scandbl) {
		System.out.print("Enter customer name: ");
		String name = scanstr.nextLine();
		System.out.print("Enter customer ID (5-digits): ");
		if (scanint.hasNextInt()) {
			int customerID = scanint.nextInt();
			if (customerID >= 10000 && customerID <= 99999) {
				System.out.print("Enter total sales: $");
				if (scandbl.hasNextDouble()) {
					double sales = scandbl.nextDouble();
					System.out.println();

					addCustomer(name, customerID, sales);
				} else {
					System.err.println("Your entry was invalid.");
					System.exit(1);
				}
			} else {
				System.err.println("Your entry was invalid.");
				System.exit(1);
			}
		}
	}

	public static void addMultipleCustomers(int numberOfCustomers, Scanner scanstr, Scanner scanint, Scanner scandbl) {
		for (int j = 0; j < numberOfCustomers; j++) {
			System.out.println("Customer " + (j + 1) + ":");
			System.out.print("Enter customer name: ");
			String name = scanstr.nextLine();
			System.out.print("Enter customer ID (5-digits): ");
			if (scanint.hasNextInt()) {
				int customerID = scanint.nextInt();
				if (customerID >= 10000 && customerID <= 99999) {
					System.out.print("Enter total sales: $");
					if (scandbl.hasNextDouble()) {
						double sales = scandbl.nextDouble();
						System.out.println();

						addCustomer(name, customerID, sales);
					} else {
						System.err.println("Your entry was invalid.");
						System.exit(1);
					}
				} else {
					System.err.println("Your entry was invalid.");
					System.exit(1);
				}
			}
		}
	}

	public static void displayAllCustomers() {
		for (int j = 0; j < customerCount; j++) {
			System.out.println("Name: " + customerNames[j]);
			System.out.println("Customer ID: " + customerIDs[j]);
			System.out.println("Sales: $" + customerSales[j]);
			System.out.println();

		}
	}

	public static void getCustomerData(Scanner scanint) {
		System.out.println("Enter customer ID: ");
		if (scanint.hasNextInt()) {
			int customerID = scanint.nextInt();
			for (int j = 0; j < customerCount; j++) {
				if (customerID == customerIDs[j]) {
					System.out.println("Name: " + customerNames[j]);
					System.out.println("Customer ID: " + customerIDs[j]);
					System.out.println("Sales: $" + customerSales[j]);
					System.out.println();
				}
			}

		} else {
			System.err.println("Your entry was invalid.");
			System.exit(1);
		}
	}

	public static void getCustomerRange(Scanner scandbl) {
		System.out.println("Please enter lowest sales amount: $ ");
		if (scandbl.hasNextDouble()) {
			double lowestSales = scandbl.nextDouble();
			System.out.println("Please enter highest sales amount: $ ");
			if (scandbl.hasNextDouble()) {
				double highestSales = scandbl.nextDouble();
				System.out.println();
				for (int j = 0; j < customerCount; j++) {
					if (customerSales[j] >= lowestSales && customerSales[j] <= highestSales) {
						System.out.println("Name: " + customerNames[j]);
						System.out.println("Customer ID: " + customerIDs[j]);
						System.out.println("Sales: $ " + customerSales[j]);
						System.out.println();
					}
				}
			} else {
				System.err.println(" Your entry was invalid.");
				System.exit(1);
			}
		} else {
			System.err.println("Your entry was invalid.");
			System.exit(1);
		}
	}

	public static void main(String[] args) {

		Scanner scanint = new Scanner(System.in);
		Scanner scanstr = new Scanner(System.in);
		Scanner scandbl = new Scanner(System.in);

		@SuppressWarnings("unused")
		Customers customers = new Customers();

		// get selection from user
		int selection;
		do {
			showMenu();
			System.out.print("Enter your selection: ");
			selection = scanint.nextInt();

			switch (selection) {
			case 1:
				System.out.print("Enter the number of customers: ");
				if (scanint.hasNextInt()) {
					int numberOfCustomers = scanint.nextInt();
					addMultipleCustomers(numberOfCustomers, scanstr, scanint, scandbl);
				} else {
					System.err.println("Your entry was invalid.");
					System.exit(1);
				}
				break;
			case 2:
				addSingleCustomer(scanstr, scanint, scandbl);
				break;
			case 3:
				displayAllCustomers();
				break;
			case 4:
				getCustomerData(scanint);
				break;
			case 5:
				getCustomerRange(scandbl);
				break;
			case 9:
				System.out.println("Thank you for using the program. Goodbye!");
				System.exit(1);
				break;
			default:
				System.err.println("Your entry was invalid.");
				System.exit(1);

			}
		} while (selection != 9);

	}

}
