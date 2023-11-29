package academy.aulas.maratonajava.introducao;
import java.util.Scanner;
/*
Escreva um programa que solicite a
quantidade de alunos de uma sala e
depois solicite a uma nota para cada
aluno, imprimindo no final a média da
sala.
 */

public class exercicioFor05 {
    public static void main(String[] args) {
        float notas = 0;
        float soma_notas = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("QUANTOS ALUNOS TEM NA SALA: ");
        int alunos = input.nextInt();
        for (int i = 0; i < alunos; i++) {
            System.out.print("DIGITE AS NOTAS: ");
            notas = input.nextFloat();
            soma_notas += notas;
        }
        float media = soma_notas/alunos;
        System.out.println("A MEDIA DA SALA É: " + media);
    }
}