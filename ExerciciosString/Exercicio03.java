package string;
/*
 * compare os 2 textos abaixo e diga se são 
iguais.
 String texto01 = "Será que são iguais?";
 String texto02 = "Será que são iguais?"
 */

public class Exercicio03 {
	public static void main(String[] args) {
		
		String texto01 = "Será que são iguais?";
		String texto02 = "Será que são iguais?";
		
		boolean b1 = texto01.equals(texto02);
		
		System.out.println(b1 == true?"É VERDADEIRO":"É FALSO");
	}

}
