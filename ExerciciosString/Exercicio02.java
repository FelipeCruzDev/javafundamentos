package string;
import java.util.*;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			
		System.out.print("Digite um texto: ");
       
        StringTokenizer texto1 = new StringTokenizer(input.nextLine());
        
	
		System.out.println(texto1.countTokens());
	}
	

}
