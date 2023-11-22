package fundamentos;
import java.util.Scanner;



public class exercicio08 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("CALCULADORA DE ALTURA\nDIGITE SUA ALTURA: ");
		double resp = entrada.nextDouble();
		System.out.println("SUA ALTURA: " +resp);
		entrada.close();
}
}
