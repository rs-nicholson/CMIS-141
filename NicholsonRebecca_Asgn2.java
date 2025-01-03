// Rebecca Nicholson / June 6, 2023 / CMIS 141
// This program will ask for two integers and an operation symbol and perform the requested operation

package CMIS141;

import java.util.Scanner;

public class NicholsonRebecca_Asgn2 {

	public static void main(String[] args) {

		Scanner scanint = new Scanner(System.in);
		Scanner scanstr = new Scanner(System.in);

		// Prompt for integers & validate input
		System.out.print("Enter two integer numbers between 200 and 1000, separated by a space: ");
		if (scanint.hasNextInt()) {
			int num1 = scanint.nextInt();
			int num2 = scanint.nextInt();
			if (num1 >= 200 && num1 <= 1000 || num2 >= 200 && num2 <= 1000) {
			} else {
				System.err.println("Your entry was not valid.");
			}

			System.out.print("Enter operation symbol (+, -, *, or /): ");
			String operator = scanstr.next();

			switch (operator) {
			case "+": {
				int addition = num1 + num2;
				System.out.print("Evaluation: " + num1 + " + " + num2 + " = " + addition);
				break;
			}
			case "-": {
				int subtraction = num1 - num2;
				System.out.print("Evaluation: " + num1 + " - " + num2 + " = " + subtraction);
				break;
			}
			case "*": {
				int multiplication = num1 * num2;
				System.out.print("Evaluation: " + num1 + " * " + num2 + " = " + multiplication);
				break;
			}
			case "/": {
				int division = num1 / num2;
				System.out.print("Evaluation: " + num1 + " / " + num2 + " = " + division);
				break;
			}
			default : {
				System.out.print("Invalid Operator!");
				return;
			}
			
			
			}
			
		}

	}
}


