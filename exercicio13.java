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
        String letra = input.next();

        if (letra.equals("M")|| letra.equals("m")){
            System.out.println("MASCULINO");
        }if (letra.equals("F") || letra.equals("f")) {
            System.out.println("FEMININO");
        }
    }
}
