package estruturaSequencial;

import java.util.Scanner;

/**
 * Faça um Programa que converta metros para centímetros.
 * @author b42
 * @Status finished
 */
public class Ex05_Meters2Cm {

	public static void main(String[] args) {
		System.out.printf("The converted value of meters to cm is: %f cm", m2c());
	
	}
	
	public static double m2c() {
		double meters = getDouble();
		double centimeters = meters * 100;
		return centimeters;
	}	
	
	public static double getDouble() {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		try {
			print("Enter with the quantity of meters that you want to convert:");
			double input = scan.nextDouble();
			return input;			
		} catch (Exception e) {
			print("You have to enter an double");
		}
		System.exit(1);
		return 0;		
	}
	
	public static void print(String str) {
		
		 System.out.println(str);
	}

}
