package estruturaSequencial;

import commons.Commons;
/**
 * Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário. 
 * @author b42
 * @Status finished
 */
public class Ex07_doubleSqare {
	
	public static void main(String[] args) {
		
		double answ = squareCalc();
		Commons.out("The total area of the square is: " + answ + "cm² \nand it's double is: " + answ*2 + "cm²");
	}

	public static double squareCalc() {
		
		Commons.out("Enter with the side area of the square (cm²)");		
		double squareSide = Commons.getDouble();
		Commons.out("Heigth and base: " + squareSide + "cm²");
		return Math.pow(squareSide, 2);
	}
}
