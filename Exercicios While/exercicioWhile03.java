import java.util.Scanner;
/*
Escreva um aplicativo em Java que recebe
inteiro e mostra os números pares e ímpares
(separados), de 1 até esse inteiro e mostre a quantidade
de numeros pares e impares achados
 */

public class exercicioWhile04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 1;
        int contimpar = 0;
        int contpar =0;
        
        System.out.print("Digite um número inteiro: ");
        int num1 = input.nextInt();

        System.out.print("Impares: ");
        while (num <= num1) {
        	if(num % 2!= 0) {
        		System.out.print(num + " ");
        		contimpar++;
        		
        }
        	num++;
        }
        
        num = 1;
        System.out.print("\nPares: ");
        while (num <= num1) {
        	if(num % 2 == 0) {
        		System.out.print(num + " ");
        		contpar++;
        	
        }
        	num++;
        }
       System.out.print("\nQUANTIDADE DE NUMEROS IMPARES:"+contimpar ); 
       System.out.print("\nQUANTIDADE DE NUMEROS PARES:"+contpar ); 

        
    }	
}
