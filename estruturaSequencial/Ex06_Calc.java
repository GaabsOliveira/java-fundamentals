package estruturaSequencial;
import commons.Commons;

/**
 * Fa�a um Programa que pe�a o raio de um c�rculo, calcule e mostre sua �rea.
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