package estruturaSequencial;

/**
 * Faça um programa que conte a recorrência de determinado caractere 
 * e mostre o caractere que mais apareceu na string 
 * @author b42
 * @Status unfinished
 * @Bonus true
 */
public class Str_count {

		public static void main(String[] args) {
			
			char[] chars = {'a','b','c','d','i','k'};
			
			for (int i = 0; i < chars.length; i++) {
				int quantidade = conta_ocorrencias(chars[i], "aaabbbbcccccddiiiikkkk");
				System.out.println(chars[i] + " = " + quantidade);
				
			}			
		}		
		
		public static int conta_ocorrencias(char caracter ,String str) {
	        int count=0;
	        for (int i=0;i<str.length();i++) {
	            if(str.charAt(i)==caracter) {
	                count++;
	            }
	        }
	        return count;
	    }
}

