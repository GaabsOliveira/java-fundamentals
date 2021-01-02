package estruturaSequencial;

/**
 * Faça um Programa que mostre a mensagem "Alo mundo" na tela.
 * @author b42
 * @Status finished
 */

public class Ex01_Hello {

	public static void main(String[] args) {
		
		char[] hello = {'D','L','R','O','W',' ','O','L','L','E','H'};
		String nineSpaces = "         ";
		
		if(!hello.equals(null) && !hello.equals("")) {
			
			for(int i = hello.length -1; i >= 0; i--) {			
				System.out.print(hello[i]);				
			}			
			System.out.println();
			for(int k = 0, j = hello.length -2; j >= 1; j--) {
									
					System.out.println(hello[j] + nineSpaces + hello[k+=1]);
				
			}			
			for(int k = 0; k < hello.length; k++) {			
				System.out.print(hello[k]);				
			}
		}			
	}
}
