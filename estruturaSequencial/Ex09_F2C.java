package estruturaSequencial;

import commons.Commons;
/**
 * Faça um Programa que peça a temperatura em graus Fahrenheit, 
 * transforme e mostre a temperatura em graus Celsius. 
 * @author b42
 * @Status finished
 */
public class Ex09_F2C {

	public static void main(String[] args) {

		System.out.println("your convet result is " + f2c());
	}
	
	/**
	 * Function that convert Cº to Fº or Fº to Cº.
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
				
				Commons.out("Please enter the Cº degrees to convert to Fº");
				double celcius = Commons.getDouble();
				double celciusConverted = (celcius * 9/5) + 32;
				return celciusConverted;
			} else {
				
				Commons.out("Please enter the Fº degrees to convert to Cº");
				double farenheit = Commons.getDouble();
				double farenheitConverted = (farenheit - 32)*5/9;
				return farenheitConverted;
			}
		}		
	}
}
