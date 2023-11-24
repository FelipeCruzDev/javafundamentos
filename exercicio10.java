package academy.aulas.maratonajava.introducao;
import java.util.Scanner;

/*
Faça um programa que leia
três números, verifique (usando if
e else) e mostre o maior e o
menor deles
 */
public class exercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("INFORME UM NUMERO:");
        double numero1 = input.nextDouble();

        System.out.println("INFORME UM NUMERO:");
        double numero2 = input.nextDouble();


        System.out.println("INFORME UM NUMERO:");
        double numero3 = input.nextDouble();

        if (numero1 == numero2 || numero2 == numero3 || numero3 == numero1){
            System.out.println("NUMEROS IGUAIS, POR FAVOR DIGITE NOVAMENTE");
        }
        if (numero1 > numero2 && numero1 > numero3 && numero2 > numero3){
            System.out.println(+numero1+" É O MAIOR NUMERO\n"+numero3+" É O MENOR NUMERO");
        } else if (numero1 > numero2 && numero1 > numero3 && numero3 > numero2){
            System.out.println(+numero1+" É O MAIOR NUMERO\n"+numero2+" É O MENOR NUMERO");
        }if (numero2 > numero1 && numero2 > numero3 && numero1 > numero3){
            System.out.println(+numero2+" É O MAIOR NUMERO\n"+numero3+" É O MENOR NUMERO");
        } else if(numero2 > numero1 && numero2 > numero3 && numero3 > numero1) {
            System.out.println(+numero2+" É O MAIOR NUMERO\n"+numero1+" É O MENOR NUMERO");
        }if (numero3 > numero1 && numero3 > numero2 && numero1 > numero2){
            System.out.println(+numero3+" É O MAIOR NUMERO\n"+numero2+" É O MENOR NUMERO");
        } else if (numero3 > numero1 && numero3 > numero2 && numero2 > numero1) {
            System.out.println(+numero3+" É O MAIOR NUMERO\n"+numero1+" É O MENOR NUMERO");

        }
    }
}
