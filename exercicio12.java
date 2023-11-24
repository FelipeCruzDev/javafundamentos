package academy.aulas.maratonajava.introducao;
import java.util.Scanner;
//String (variavel) = (condicao)?verdadeiro:falso;
/*
Faça um programa que solicite
2 notas de um aluno e calcule a
média dele e mostre na tela
 */
public class exercicio12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Diga a primeira nota: ");
        float nota1 = input.nextFloat();

        System.out.println("Diga a Segunda nota: ");
        float nota2 = input.nextFloat();

        float resultado = (nota1 + nota2) / 2;
        System.out.println("A média é: " + resultado);

        if (resultado > 7) {
            System.out.println("ALUNO APROVADO,PARABENS");
        }
        if (resultado > 4) {
            System.out.println("ALUNO VAI PRA RECUPERAÇÃO");
        } else {
            System.out.println("ALUNO REPROVADO!");
        }
    }
}
