//Rebecca Nicholson / June 14, 2023 / This program prompts user selection and then runs selected program
package CMIS141;

import java.util.Scanner;

public class NicholsonRebecca_Asgn5 {

	static Scanner scanint = new Scanner(System.in);
	static Scanner scanstr = new Scanner(System.in);

	// method to convert cubic feet to U.S bushels
	public static double bushelsConversion(int cubicFeet) {
		double BUSHELS_TO_FEET = 0.803564;
		double bushels = cubicFeet * BUSHELS_TO_FEET;
		System.out.printf(cubicFeet + " cubic ft. = %.5f U.S bushels.", bushels);
		return bushels;
	}

	// method to convert miles to km
	public static double milesConversion(int miles) {
		double MILES_TO_KM = 1.60934;
		double km = miles * MILES_TO_KM;
		System.out.printf(miles + " miles = %.5f kilometers.", km);
		return km;
	}

	// method to determine graduation category
	public static double gradCategory(String gpa) {
		switch (gpa) {
		case "3.5":
		case "3.6":
		case "3.7":
			System.out.print("Congratulations, you have graduated Cum Laude!");
			break;
		case "3.8":
		case "3.9":
			System.out.print("Congratulations, you have graduated Magna Cum Laude!");
			break;
		case "4.0":
			System.out.print("Congratulations, you have graduated Summa Cum Laude!");
			break;
		default:
			System.out.print("Your entry does not qualify for a graduation category.");
		}
		return 0;

	}

	public static void main(String[] args) {

		// provide menu options
		System.out.println("MENU");
		System.out.println("1: Convert cubic feet to U.S. bushels");
		System.out.println("2: Convert miles to kilometers");
		System.out.println("3: Determine graduation title with honors");
		System.out.println("9: Exit program");
		System.out.println();

		// get selection from user
		System.out.print("Enter your selection: ");
		int selection = scanint.nextInt();
		while (selection != 9) {
			if (selection == 1) {
				// prompt user for input
				System.out.print("Enter cubic feet: ");
				int cubicFeet = scanint.nextInt();

				// call method
				bushelsConversion(cubicFeet);
			} else if (selection == 2) {

				// prompt user for input
				System.out.print("Enter miles: ");
				int miles = scanint.nextInt();

				// call method
				milesConversion(miles);

			} else if (selection == 3) {

				// prompt user for input
				System.out.print("Enter GPA: ");
				String gpa = scanstr.next();

				// call method
				gradCategory(gpa);

			} else
				System.out.print("Your entry was not valid.");

			System.out.print("\n\n");
			System.out.println("MENU");
			System.out.println("1: Convert cubic feet to U.S. bushels");
			System.out.println("2: Convert miles to kilometers");
			System.out.println("3: Determine graduation title with honors");
			System.out.println("9: Exit program");
			System.out.println();
			System.out.print("Enter your Selection: ");
			selection = scanint.nextInt();
		}
		if (selection == 9) {
			System.out.print("Thank you for using the program. Goodbye!");
		}
	}
}
