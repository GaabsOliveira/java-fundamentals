package estruturaSequencial;

import commons.Commons;
/**
 * Fa�a um Programa que pergunte quanto voc� ganha por hora e o n�mero de horas trabalhadas no m�s. 
 * Calcule e mostre o total do seu sal�rio no referido m�s. 
 * @author b42
 * @Satus finished
 */
public class Ex08_Payday {
	
	public static void main(String[] args) {
		
		paydayCount();
	}
	/**
	 * @author b42
	 * function that calculates the hour value x worked hours.
	 * @return double: Amount per worked hours
	 */
	public static double paydayCount() {
		
		Commons.out("How much ($) do you get per worked hour?");
		
		double amountPerHour = Commons.getDouble();
		Commons.out("How many hours do you have been worked this month?");
		
		double workedHours = Commons.getDouble();		
		double amountPerWorkedHours = amountPerHour*workedHours;
		
		Commons.out("This month you've been working for: "+ workedHours + " hours\nand your incommings for those hours is: R$" + amountPerWorkedHours);
		return amountPerWorkedHours;
	}
}
