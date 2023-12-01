package repeticoes;

import java.util.Scanner;

/*
Escreva um código que
receba uma nota de 5 alunos,
guarde todas num array notas.
Depois calcule a média da turma.
 */
public class array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
   
        float[] notas = new float[5];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("DIGITE UMA NOTA:");
            notas[i] = input.nextFloat();
        }

        float somaNotas = 0;
        for (float nota : notas) {
            somaNotas += nota;
        }

        float media = somaNotas / notas.length;
        System.out.println("Média da turma: " + media);

    }
}
