package academy.aulas.maratonajava.introducao;
import java.util.Scanner;
//String (variavel) = (condicao)?verdadeiro:falso;

/*
Faça um programa que peça um
valor e mostre na tela se o valor
é positivo ou negativo.
 */
public class exercicio09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero:");
        double resp = input.nextDouble();
        String resultado =resp == 0 ? "NUMERO NEUTRO" : resp >=1 ?"O NUMERO É POSITIVO" : "O NUMERO É NEGATIVO";
        System.out.println(resultado);
        }
    }
