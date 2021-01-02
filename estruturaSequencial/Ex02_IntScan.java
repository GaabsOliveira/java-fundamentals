package estruturaSequencial;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Fa�a um Programa que pe�a um n�mero e ent�o mostre a mensagem O n�mero informado foi [n�mero]. 
 * @author b42
 * @Status finished
 */
public class Ex02_IntScan {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String preMessage = "informe um n�mero";
		String posMessage = "O n�mero informado foi: %s";
		
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
