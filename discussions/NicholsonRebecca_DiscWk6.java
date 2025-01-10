//Rebecca Nicholson / June 14, 2023 / This program calculates the volume of a cylinder
package CMIS141;

import java.util.Scanner;

public class NicholsonRebecca_DiscWk6 {
	
	static Scanner scanint = new Scanner(System.in);
	
	//method to calculate volume of cylinder
	public static double cylinderVolume(int radius, int height) {
		double volume = Math.PI * (radius * radius) * height;
		System.out.printf("The volume of your cylinder is %.2f", volume);
		return volume;
	}
	public static void main(String[] args) {
		
		//prompt user for input
		System.out.print("Enter the radius of your cylinder: ");
		int radius = scanint.nextInt();
		System.out.println("Enter the height of your cylinder: ");
		int height = scanint.nextInt();
		
		//call method
		cylinderVolume(radius, height);
		
	}
}
