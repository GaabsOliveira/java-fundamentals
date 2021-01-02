package estruturaSequencial;

/**
 * Faça um programa que verifica se a string informada é ou não um palíndromo.
 * @author b42
 * @Status finished
 * @Bonus true
 */
public class palindromecount {

	public static void main(String[] args) {
		
		System.out.println(compareStr("reviver"));
	}

	public static String strReverse(String str) {
		
		StringBuilder input = new StringBuilder();		
		input.append(str.toLowerCase());
		String reversedStr = input.reverse().toString();
		
		return reversedStr;
	}
	
	public static Boolean compareStr(String str) {
		
		Boolean flag = false;
		String reversedStr = strReverse(str);
		
		if(str.toLowerCase().equals(reversedStr)) {
			
			flag = true;
		}
		return flag;
	}
	
}
