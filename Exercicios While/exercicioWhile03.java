package academy.aulas.maratonajava.introducao;
import java.util.Scanner;
/*
Escreva um aplicativo em Java que recebe
inteiro e mostra os números pares e ímpares
(separados), de 1 até esse inteiro.
 */
import java.util.Scanner;

public class exercicioWhile03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = input.nextInt();
        System.out.println("Números pares:");
        int i = 2;
        while (i <= num) {
            System.out.print(i + " ");
            i += 2;
        }
        System.out.println("\nNúmeros ímpares:");
        i = 1;
        while (i <= num) {
            System.out.print(i + " ");
            i += 2;
        }
    }
}