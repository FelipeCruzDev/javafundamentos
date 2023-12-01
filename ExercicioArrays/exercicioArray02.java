package academy.aulas.maratonajava.introducao;

import java.util.*;

/*
Escreva um código que
receba uma nota de 5 alunos,
guarde todas num array notas.
Depois calcule a média da turma.
 */
public class exercicioArray02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int alunos = 5;
        float[] notas = new float[alunos];

        for (int i = 0; i < alunos; i++) {
            System.out.println("DIGITE UMA NOTA:");
            notas[i] = input.nextFloat();
        }

        float somaNotas = 0;
        for (float nota : notas) {
            somaNotas += nota;
        }

        float media = somaNotas / alunos;
        System.out.println("Média da turma: " + media);

        input.close();
    }
}

