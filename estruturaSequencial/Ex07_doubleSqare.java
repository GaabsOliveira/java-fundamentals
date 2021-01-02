package estruturaSequencial;

import commons.Commons;
/**
 * Fa�a um Programa que calcule a �rea de um quadrado, em seguida mostre o dobro desta �rea para o usu�rio. 
 * @author b42
 * @Status finished
 */
public class Ex07_doubleSqare {
	
	public static void main(String[] args) {
		
		double answ = squareCalc();
		Commons.out("The total area of the square is: " + answ + "cm� \nand it's double is: " + answ*2 + "cm�");
	}

	public static double squareCalc() {
		
		Commons.out("Enter with the side area of the square (cm�)");		
		double squareSide = Commons.getDouble();
		Commons.out("Heigth and base: " + squareSide + "cm�");
		return Math.pow(squareSide, 2);
	}
}
