//Rebecca Nicholson / May 28, 2023 / This program will calculate customer total before and after a discount is applied.
package CMIS141;

import java.util.Scanner;

public class NicholsonRebecca_Asgn1 {

	public static void main(String[] args) {

		Scanner scanint = new Scanner(System.in);
		Scanner scandouble = new Scanner(System.in);
		Scanner scanstr = new Scanner(System.in);

		// Gather customer input
		System.out.print("Please enter your customer ID: ");
		int customer_id = scanint.nextInt();
		System.out.print("Please enter unit price: ");
		double unit_price = scandouble.nextDouble();
		System.out.print("Please enter quantity: ");
		int quantity = scanint.nextInt();
		System.out.print("Please enter product description: ");
		String product_description = scanstr.nextLine();
		System.out.print("Please enter discount in decimal format: ");
		double discount = scandouble.nextDouble();
		System.out.print("\n\n");

		// Displays summary of customer input
		System.out.print("ORDER DATA:\n");
		System.out.print("Customer ID: " + customer_id + "\n");
		System.out.printf("Unit Price: %.2f", unit_price);
		System.out.print("\n");
		System.out.print("Quantity: " + quantity + "\n");
		System.out.print("Product Description: " + product_description + "\n");
		System.out.printf("Discount: %.2f \n", discount);
		System.out.print("\n\n");

		// Calculates order total before discount
		double before_total;
		before_total = unit_price * quantity;

		// Displays order total before discount
		System.out.printf("Order total BEFORE discount: %.2f \n", before_total);

		// Calculates order total after discount
		double after_total;
		after_total = before_total * 1 - (before_total * discount);

		// Displays order total after discount
		System.out.printf("Order total AFTER discount: %.2f \n\n", after_total);
		
		scanint.close();
		scandouble.close();
		scanstr.close();

	}

}
