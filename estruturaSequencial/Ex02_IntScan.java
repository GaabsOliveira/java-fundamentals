package estruturaSequencial;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número]. 
 * @author b42
 * @Status finished
 */
public class Ex02_IntScan {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String preMessage = "informe um número";
		String posMessage = "O número informado foi: %s";
		
		System.out.println(preMessage);
		double scannedNumber = scan.nextDouble();
		
		doubleFormat(scannedNumber);
		
		System.out.printf(posMessage, scannedNumber);
		System.exit(0);
		
	}
	
	public static String doubleFormat(double scannedNumber) {
		String resp = "";
		DecimalFormat formatter = new DecimalFormat("#.00");
		try {
			resp = formatter.format(scannedNumber);
		}catch (Exception e) {
			System.out.println("Erro ao formatar numero: " +e);
		}
		return resp;
	}
}
