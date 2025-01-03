//Rebecca Nicholson / June 14, 2023 / This program prompts user for number of rows then prints counting to said number.
package CMIS141;

import java.util.Scanner;

public class NicholsonRebecca_Asgn4 {

	public static void main(String[] args) {

		Scanner scanint = new Scanner(System.in);
		
		//get input from user
		System.out.println("Enter the desired number of rows: ");
		int userRows = scanint.nextInt();
		for (int rows = 0; rows <= userRows; rows++) {
			for (int columns = 1; columns <= rows; columns++) {
				
				//format output to use 2 spaces
				System.out.printf("%2d", columns);
		}
		System.out.println();
		
		scanint.close();
		}
	}
}
