//Rebecca Nicholson / June 13, 2023 / This program prompts for current month and displays how many months until Chrismas.
package CMIS141;

import java.util.Scanner;

public class NicholsonRebecca_DiscWk4 {

	public static void main(String[] args) {

		Scanner scanint = new Scanner(System.in);
		
		// Prompt for input
		System.out.print("Enter the number of the current month: ");
		int month = scanint.nextInt();
		int december = 12;
		int months_left = december - month;

		while (months_left <= december) {
			System.out.print(december + ", ");
			december -= 1;
		}
		System.out.println("months until Christmas!");
		
		
		scanint.close();
	}
}
