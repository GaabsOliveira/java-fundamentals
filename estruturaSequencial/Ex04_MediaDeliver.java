package estruturaSequencial;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Faça um Programa que peça as 4 notas bimestrais e mostre a média. 
 * @author b42
 * @Status finished
 */
public class Ex04_MediaDeliver {
	
	public static void main(String[] args) {
		
		getMedia();		
		
	}
	
	public static void getMedia() {
		
		ArrayList<Double> values = new ArrayList<Double>();
		
		MessageSystem messages = new MessageSystem();
		
		System.out.println(messages.insertAmmount());
		
		double answer = 0.0;
		
		int mediasToCalc = getInteger();
		
		for (int i = 0; i < mediasToCalc; i++) {
		
			System.out.printf(messages.insertValue(), i+1);
			values.add(getDouble());
		}
		
		for (int i = 0; i < values.size(); i++) {			
			answer += values.get(i);
		}
		
		System.out.println(answer/mediasToCalc);
	}
	
	/**
	 * class that returns the next
	 * double value inputed by the
	 * user.
	 * @author b42
	 * @return double
	 */
	public static double getDouble() {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		try {
			double val = scan.nextDouble();
			return val;
		} catch (Exception e) {
			System.out.println("Error code 0 - The inserted value isn't equivalent a double. " + e);
		}
			System.exit(1);
			return 0;
	}
	
	/**
	 * class that returns the next
	 * integer value inputed by the
	 * user.
	 * @author b42
	 * @return double
	 */
	public static int getInteger() {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		try {
			int val = scan.nextInt();
			return val;
		} catch (Exception e) {
			System.out.println("Error code 0 - The inserted value isn't equivalent a Integer. " + e);
		}
			System.exit(1);
			return 0;
	}	
	
}
