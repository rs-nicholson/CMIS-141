//Rebecca Nicholson / June 14, 2023 / This program takes values of an array and triples them.
package CMIS141;

import java.util.Scanner;

public class NicholsonRebecca_DiscWk7 {

	Scanner scanint = new Scanner(System.in);

	// method to print array
	public static void printArray(int[] a) {
		System.out.print("{" + a[0]);
		for (int i = 1; i < a.length; i++) {
			System.out.print(", " + a[i]);
		}
		System.out.println("}");
	}

	// method to triple value
	public static void tripleValue(int[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] *= 3;

		}
	}

	public static void main(String[] args) {
		// set array values
		int[] a = { 3, 6, 9, 12, 15, 18, 21 };
		
		// call method to triple value
		tripleValue(a);
		
		// call method to print to console
		printArray(a);
	}
}