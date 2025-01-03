//Rebecca Nicholson / June 15, 2023 / This program prompts user selection and then runs selected program
package CMIS141;

import java.util.Scanner;

public class NicholsonRebecca_Project {

	static Scanner scanint = new Scanner(System.in);
	static Scanner scanstr = new Scanner(System.in);
	static Scanner scandbl = new Scanner(System.in);

	public class Customers {
		private int maxCustomers = 100;
		private static String[] customerNames;
		private static int[] customerIDs;
		private static double[] customerSales;
		private static int customerCount;

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
			int customerID = scanint.nextInt();
			System.out.print("Enter total sales: $");
			double sales = scandbl.nextDouble();

			addCustomer(name, customerID, sales);
		}

		public static void addMultipleCustomers(int numberOfCustomers, Scanner scanstr, Scanner scanint,
				Scanner scandbl) {
			for (int j = 0; j < numberOfCustomers; j++) {
				System.out.println("Customer " + (j + 1) + ":");
				System.out.print("Enter customer name: ");
				String name = scanstr.nextLine();
				System.out.print("Enter customer ID (5-digits): ");
				int customerID = scanint.nextInt();
				System.out.print("Enter total sales: $");
				double sales = scandbl.nextDouble();

				addCustomer(name, customerID, sales);

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
			int customerID = scanint.nextInt();
			for (int j = 0; j < customerCount; j++) {
				if (customerID == customerIDs[j]) {
					System.out.println("Name: " + customerNames[j]);
					System.out.println("Customer ID: " + customerIDs[j]);
					System.out.println("Sales: $" + customerSales[j]);
				}

			}
		}

		public static void getCustomerRange(Scanner scandbl) {
			System.out.println("Please enter lowest sales amount: $ ");
			double lowestSales = scandbl.nextDouble();
			System.out.println("Please enter highest sales amount: $ ");
			double highestSales = scandbl.nextDouble();
			for (int j = 0; j < customerCount; j++) {
				if (customerSales[j] >= lowestSales && customerSales[j] <= highestSales) {
					System.out.println("Name: " + customerNames[j]);
					System.out.println("Customer ID: " + customerIDs[j]);
					System.out.println("Sales: $ " + customerSales[j]);
				}
			}
		}

		public static void main(String[] args) {

			showMenu();

			// get selection from user
			System.out.print("Enter your selection: ");
			int selection = scanint.nextInt();
			while (selection != 9) {

				switch (selection) {
				case 1:
					System.out.print("Enter the number of customers: ");
					int numberOfCustomers = scanint.nextInt();
					addMultipleCustomers(numberOfCustomers, scanint, scandbl, scandbl);
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
					System.out.println("Your entry was invalid.");
					System.exit(1);

				}
			}
		}

	}
}
