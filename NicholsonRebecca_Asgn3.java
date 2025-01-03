//Rebecca Nicholson / June 13, 2023 / This program calculates gamer's total XP score.
package CMIS141;

import java.util.Scanner;

public class NicholsonRebecca_Asgn3 {

	public static void main(String[] args) {

		Scanner scanstr = new Scanner(System.in);
		Scanner scanint = new Scanner(System.in);
		
		// Prompt for input
		System.out.print("Welcome to the Total XP calculation program! \n\n");
		System.out.print("Do you want to enter gamer's data? Yes/No: ");
		String answer = scanstr.nextLine();
		while (answer.equalsIgnoreCase("Yes")) {
			System.out.print("Enter gamer's name: ");
			String gamer_name = scanstr.nextLine();
			System.out.print("Enter gamer's Level XP scores separated by space: L1 L2 L3 ES: ");
			int L1 = scanint.nextInt();
			int L2 = scanint.nextInt();
			int L3 = scanint.nextInt();
			int ES = scanint.nextInt();
			System.out.print("\n");
			System.out.print("Gamer Name: " + gamer_name + " L1=" + L1 + " L2=" + L2 + " L3=" + L3 + " ES=" + ES + "\n");
			double final_score = L1+L1*0.20+L2+L2*0.30+L3+L3*0.50+ES+ES*0.60;
			System.out.printf("Final XP score with bonuses= %.0f", final_score);
			System.out.print("\n\n");
			System.out.print("Do you want to enter another gamer's data? Yes/No: ");
			answer = scanstr.nextLine();
			 }
		System.out.print("\n");
		System.out.println("Thank you for using the Total XP calculation program!");
		
		scanstr.close();
		scanint.close();
		}

}