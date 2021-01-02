package commons;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Commons {

	static Scanner scan = new Scanner(System.in);
	
	/**
	 * Function to Scan a integer from the main input. 
	 * @return integer
	 * @author b42
	 */
	public static int getInt() {
		
		out(Messages.getInsertInt());		
		try {
			return scan.nextInt();
		} catch (Exception e) {
			out(Messages.getScanError() + e);
			System.exit(1);
			return 0;
		}		
	}
	
	/**
	 * Function to Scan a string from the main input. 
	 * @return String
	 * @author b42
	 */
	public static double getDouble() {
		
		out(Messages.getInsertDouble());	
		try {
			return scan.nextDouble();
		} catch (Exception e) {
			out(Messages.getScanError() + e);
			System.exit(1);
			return 0;
		}		
	}
	
	/**
	 * Function to Scan a string from the main input. 
	 * @return String
	 * @author b42
	 */
	public static String getString() {
		
		out(Messages.getInsertString());	
		try {
			return scan.next();
		} catch (Exception e) {
			out(Messages.getScanError() + e);
			System.exit(1);
			return "";
		}		
	}
	
	/**
	 * Function to display a String in the main output.
	 * @param string
	 * @author b42
	 */
	public static void out(String str) {
		System.out.println(str);
	}
	
	/**
	 * Function to format a double precision number to "N.00". 
	 * @param scannedNumber
	 * @return String
	 * @author b42
	 */
	public static String doubleFormat(double scannedNumber) {
		
		String resp = "";
		DecimalFormat formatter = new DecimalFormat("#.##");
		try {
			resp = formatter.format(scannedNumber);
		}catch (Exception e) {
			out("Erro ao formatar numero: " +e);
		}
		return resp;
	}
}
