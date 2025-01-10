//Rebecca Nicholson / June 13, 2023 / This program gives user 3 attempts to guess favorite color
package CMIS141;

import java.util.Scanner;

public class NicholsonRebecca_DiscWk5 {

	public static void main(String[] args) {

		Scanner scanstr = new Scanner(System.in);
		
		String answer = "purple";
		System.out.println("You have 3 chances to guess my favorite color.");
			for (int attempts = 0; attempts < 3; attempts++) {
				System.out.println("Guess my favorite color: ");
				String guess = scanstr.nextLine();
				
				if (guess.compareTo(answer) != 0) {
					System.out.println("That was incorrect!");
				}else {
					System.out.println("Yay, that was correct!");
					attempts = 4;
				}

		}
	}
}
		
