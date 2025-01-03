//Rebecca Nicholson / June 4, 2023 / This program generate a different message based on how many college credits you have.
package CMIS141;

import java.util.Scanner;

public class NicholsonRebecca_DiscWk3 {

	public static void main(String[] args) {

		Scanner scanint = new Scanner(System.in);
		
		// Prompt for input
		System.out.print("How many college credits have you earned towards your degree?: ");
		int credits = scanint.nextInt();
		
		//Determines output message based on number of credits
		if (credits > 60) {
			System.out.println("You're on the home stretch!");
		} else if (credits == 60) {
			System.out.println("You're halfway there!");
		} else {
			System.out.println("Great start, keep going!");
		}
		
		scanint.close();
	}
}