package academy.aulas.maratonajava.introducao;
/*
Escreva um programa que calcule a soma
dos multiplos de 3 e 5, no intervalo entre
1 e 20. No final, mostre a soma dos
multiplos de 3 e 5 e a soma total.
 */
public class exercicioFor06 {
        public static void main(String[] args) {
            int soma = 0;
            int soma1 = 0;
            for (int i = 1; i <= 20; i++) {
                if (i % 3 == 0) {
                    soma += i;
                    System.out.println(" A SOMA TOTAL DOS MULTIPLOS DE 3 é " +soma);
                } else if (i % 5 == 0) ;
                soma1 += i;
                System.out.println("A SOMA TOTAL DOS MULTIPLOS DE 5 é "+soma1);
            }int resultado = soma+soma1;
            System.out.println(resultado);
        }
    }
