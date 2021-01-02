package estruturaSequencial;

import commons.Commons;
/**
 * Fa�a um Programa que pe�a a temperatura em graus Fahrenheit, 
 * transforme e mostre a temperatura em graus Celsius. 
 * @author b42
 * @Status finished
 */
public class Ex09_F2C {

	public static void main(String[] args) {

		System.out.println("your convet result is " + f2c());
	}
	
	/**
	 * Function that convert C� to F� or F� to C�.
	 * @author b42
	 * @return double or zero
	 */
	public static double f2c() {
		
		Commons.out("Please choose your converter:");
		Commons.out("1 - Celcius to Farenheit\n2 - Farenheit to Celcius\n any other number to stop the program.");
		int choose = Commons.getInt();
		
		if(choose != 1 && choose != 2) {
			Commons.out("Exiting...");
			System.exit(0);
			return 0;
		} else {
			if(choose == 1) {
				
				Commons.out("Please enter the C� degrees to convert to F�");
				double celcius = Commons.getDouble();
				double celciusConverted = (celcius * 9/5) + 32;
				return celciusConverted;
			} else {
				
				Commons.out("Please enter the F� degrees to convert to C�");
				double farenheit = Commons.getDouble();
				double farenheitConverted = (farenheit - 32)*5/9;
				return farenheitConverted;
			}
		}		
	}
}
