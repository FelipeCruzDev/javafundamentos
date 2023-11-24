package academy.aulas.maratonajava.introducao;
import java.util.Scanner;
/*
Faça um programa que
verifique (usando if e else) se
uma letra digitada é “F” ou “M”.
Conforme a letra escrever: F –
Feminino, M- Masculino.
 */
public class exercicio13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("DIGITE UMA LETRA [M/F]:");
        char letra = input.next().charAt(0);

        if (letra == 'M'|| letra == 'm'){
            System.out.println("MASCULINO");
        }if (letra == 'F'|| letra == 'f') {
            System.out.println("FEMININO");
        }
    }
}
