//Rebecca Nicholson / June 14, 2023 / This program prompts user for a number then prints reverse rectangle.
package CMIS141;

import java.util.Scanner;

public class NicholsonRebecca_Asgn4B {

	public static void main(String[] args) {

		Scanner scanint = new Scanner(System.in);
		
		//get input from user
		System.out.println("Enter the value of N: ");
		int N = scanint.nextInt();
		for (int rows = 1; rows < N*2; rows++) {
			for (int columns = 1; columns < N*2; columns++) {
				if (rows == 1 || rows == N*2-1 || columns == 1 || columns == N*2-1)
					System.out.printf("%2d", N);
				else if (rows == 2 || rows == N*2-2 || columns == 2 || columns == N*2-2)
					System.out.printf("%2d", N-1);
				else if (rows == 3 || rows == N*2-3 || columns == 3 || columns == N*2-3)
					System.out.printf("%2d", N-2);
				else if (rows == 4 || rows == N*2-4 || columns == 4 || columns == N*2-4)
					System.out.printf("%2d", N-3);
				else if (rows == 5 || rows == N*2-5 || columns == 5 || columns == N*2-5)
					System.out.printf("%2d", N-4);
				else if (rows == 6 || rows == N*2-6 || columns == 6 || columns == N*2-6)
					System.out.printf("%2d", N-4);
				else if (rows == 7 || rows == N*2-7 || columns == 7 || columns == N*2-7)
					System.out.printf("%2d", N-4);
				else if (rows == 8 || rows == N*2-8|| columns == 8 || columns == N*2-8)
					System.out.printf("%2d", N-4);
				else if (rows == 9 || rows == N*2-9 || columns == 9 || columns == N*2-9)
					System.out.printf("%2d", N-4);
				else if (rows == 10 || rows == N*2-10 || columns == 10 || columns == N*2-10)
					System.out.printf("%2d", N-4);

		}
		System.out.println();
		
		scanint.close();
		}
	}
}