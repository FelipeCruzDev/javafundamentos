package fundamentos;
import java.util.Scanner;

public class exercicio14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
			int cont = 0;
			int resp,resp2,resp3,resp4,resp5 = 0;
			
			System.out.println("DIGITE O NOME: ");
		    String nome = input.next();
		    
			System.out.println("Telefonou para a Vitima? 1[SIM] / 2[NÃO]");
			 resp = input.nextInt();
			
			System.out.println("Esteve no local do crime? 1[SIM] / 2[NÃO]");
			 resp2 = input.nextInt();
			
			System.out.println("Mora perto da vitima? 1[SIM] / 2[NÃO]");
			 resp3 = input.nextInt();
			
			System.out.println("Devia pra vitima? 1[SIM] / 2[NÃO]");
			 resp4 = input.nextInt();	
			
			System.out.println("Ja trabalhou com a vitima? 1[SIM] / 2[NÃO]");
			 resp5 = input.nextInt();
			 
		
			if (resp == 1) {
				cont++;
				}if (resp2 == 1) {
					cont ++;
				}if (resp3 == 1) {
					cont ++;
				}if (resp4 == 1) {
					cont++;
				}if (resp5 == 1) {
					cont ++;
			}if (cont == 5) {
				System.out.println(nome +  "É O ASSASSINO!");
				
			}if (cont == 2) {
				System.out.println(nome+"É SUSPEITO");
			}if (cont ==3 || cont ==4) {
				System.out.println(nome+  "É CUMPLICE");
			
			}if (cont < 1) {
				
			System.out.println(nome+  "É INOCENTE");
			}
	}
}
			
