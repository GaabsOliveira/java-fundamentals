package estruturaSequencial;

import commons.Commons;
/**
 * Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
 * Calcule e mostre o total do seu salário no referido mês. 
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
