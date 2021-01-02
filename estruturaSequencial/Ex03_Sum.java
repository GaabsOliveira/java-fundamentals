package estruturaSequencial;

import java.util.Scanner;

/**
 * Faça um Programa que peça dois números e imprima a soma.
 * @author b42
 * @Status finished
 */
public class Ex03_Sum {

	public static void main(String[] args) {

		System.out.print(sum());
	}

	/**
	 * function that scans a double and validate it
	 * @author b42
	 * @since 0.0.0
	 * @return
	 */
	public static double scan() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);	
		try {
			System.out.print("please, insert an value \nyou:");
			double input = scan.nextDouble();
			return input;
		} catch (Exception e) {
			Boolean flag = err();
			if(flag) {
				
			} else {
			System.exit(1);
			return 0;
			}
			System.exit(1);
			return 0;
		}		
	}
	
	/**
	 * function that catch an error and asks the user
	 * if he/she want's to try again.
	 * @author b42
	 * @since 0.0.0
	 * @return
	 */
	public static boolean err() {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("You can't input a letter here.\nwanna try again? (y/n)\nyou:");
		String repeat = scan.next();
		if(repeat.equalsIgnoreCase("y") || repeat.equalsIgnoreCase("yes")) {
			System.out.print(sum());
			return true;
		} else {
			System.out.println("program terminated.\n");
			return false;
		}
	}
	
	/**
	 * function that does the sum with the two values.
	 * @author b42
	 * @since 0.0.0
	 * @return
	 */
	public static double sum() {
		
		double number1 = scan();
		double number2 = scan();
		return number1 + number2;
	}
	
}
