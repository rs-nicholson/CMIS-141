//Rebecca Nicholson / June 14, 2023 / This program collects team names & scores & prints highest and lowest scores.
package CMIS141;

import java.util.Scanner;

public class NicholsonRebecca_Asgn6 {

	static Scanner scanint = new Scanner(System.in);
	static Scanner scanstr = new Scanner(System.in);

	// finds smallest value
	public static void getSmallest(String[] teamNames, int[] teamScores) {
		String teamSmallest = teamNames[0];
		int smallest = teamScores[0];
		for (int i = 0; i < teamScores.length; i++) {
			if (teamScores[i] < smallest) {
				smallest = teamScores[i];
				teamSmallest = teamNames[i];
			}
		}
		System.out.print(" and the " + teamSmallest + " have the lowest score at " + smallest + ".");
	}

	// finds largest value
	public static void getLargest(String[] teamNames, int[] teamScores) {
		String teamLargest = teamNames[0];
		int largest = teamScores[0];
		for (int i = 0; i < teamScores.length; i++) {
			if (teamScores[i] > largest) {
				largest = teamScores[i];
				teamLargest = teamNames[i];
			}
		}

		System.out.println();
		System.out.print("The " + teamLargest + " have the highest score at " + largest);

	}

	// prints team name with team score
	public static void printIndex(String[] teamNames, int[] teamScores) {
		for (int i = 0; i < teamScores.length; i++) {
			System.out.println();
			System.out.printf("%-20s ", teamNames[i]);
			System.out.print(teamScores[i]);
			System.out.print("\n\n");
		}

	}

	public static void printArrayString(String[] a) {
		System.out.print("{" + a[0]);
		for (int i = 1; i < a.length; i++) {
			System.out.print(", " + a[i]);
		}
		System.out.println("}");
	}

	public static void main(String[] args) {

		// user input number of teams
		System.out.print("How many teams do you want to enter: ");
		int teamCount = scanint.nextInt();

		// creates 2 arrays with memory length of user input
		String[] teamNames = new String[teamCount];
		int[] teamScores = new int[teamCount];

		// get team info from user
		for (int j = 0; j < teamCount; j++) {
			System.out.println("Team " + (j + 1) + ":");
			System.out.print("Enter the team's name: ");
			teamNames[j] = scanstr.nextLine();
			System.out.print("Enter the team's score (400 - 1000): ");

			// validate entry is an integer
			if (scanint.hasNextInt()) {
				teamScores[j] = scanint.nextInt();

				// validate number is in valid range
				if (teamScores[j] >= 400 && teamScores[j] <= 1000) {

				} else {
					System.err.println("That is not a valid entry.");
					System.exit(1);
				}

			}

		}

		printIndex(teamNames, teamScores);
		getLargest(teamNames, teamScores);
		getSmallest(teamNames, teamScores);

	}
}
