package academy.aulas.maratonajava.introducao;

import java.util.Scanner;
/*
   3 – Faça um Programa que leia
       um número e exiba o dia
       correspondente da semana. (1-
       Domingo , 2- Segunda, etc.) se
       digitar outro valor deve aparecer
       (valor inválido)
 */

public class exercicio11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("DIGITE UM NUMERO:");
        int numero = input.nextInt();

        if (numero <= 0 || numero >= 8) {
            System.out.println("NUMERO INVALIDO");
        }
        if (numero == 1) {
            System.out.println("Segunda Feira.");
        }
        if (numero == 2) {
            System.out.println("Terça Feira.");
        }
        if (numero == 3) {
            System.out.println("Quarta Feira.");
        }
        if (numero == 4) {
            System.out.println("Quinta Feira.");
        }
        if (numero == 5) {
            System.out.println("Sexta Feira.");
        }
        if (numero == 6) {
            System.out.println("Sabado.");
        }
        if (numero == 7) {
            System.out.println("Domingo.");
        }
    }
}

