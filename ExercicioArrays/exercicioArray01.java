package academy.aulas.maratonajava.introducao;

import javax.swing.*;

public class exercicioArray01 {
    /*
Para cada conjunto de
valores abaixo, escreva o código
Java, usando laço(s), que preencha
um array com os valores.
a) 10 9 8 7 6 5 4 3 2 1
b) 0 1 4 9 16 25 36 49 64 81 100
c) 1 2 3 4 5 10 20 30 40 50
d) 3 4 7 12 19 28 39 52 67 84
     */
    public static void main(String[] args) {
        int[] num1 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1,};
        int[] num2 = {0, 1, 4, 9, 16, 25, 36, 49, 64, 81, 100};
        int[] num3 = {1, 2, 3, 4, 5, 10, 20, 30, 40, 50};
        int[] num4 = {3, 4, 7, 12, 19, 28, 39, 52, 67, 84};

        for (int i : num1) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : num2) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : num3) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : num4) {
            System.out.print(i + " ");


        }
    }
}
