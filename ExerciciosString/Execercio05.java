package string;
import java.util.*;
/*
 *  Faça um programa que receba de um usuário, 
um texto e exiba esse texto em letras 
maiúsculas.
 */
public class Execercio05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um texto:");		
        String texto = input.nextLine();
        
        String resultado = texto.toUpperCase();
        System.out.println(resultado);

		// TODO Auto-generated method stub

	}

}
