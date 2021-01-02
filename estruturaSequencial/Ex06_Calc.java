package estruturaSequencial;
import commons.Commons;

/**
 * Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
 * @author b42
 * @Status finished
 */
public class Ex06_Calc {
	
	public static void main(String[] args) {
		
		Commons.out("You're about to calculate the area of a circle.");
		Commons.out("Formula = A = PI * R2");		
		Commons.out(Commons.doubleFormat(getArea()));
		
	}
	
	public static double getArea() {
		double raio = Commons.getDouble();
		return Math.PI * (raio*raio);
	}
}