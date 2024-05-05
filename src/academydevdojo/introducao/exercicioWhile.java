package academydevdojo.introducao;
import java.util.Scanner;
public class exercicioWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota;
        System.out.println("QUAL A NOTA [0/10]: ");
        nota = input.nextDouble();
        while (nota <=10 || nota >=0)
            System.out.println("NOTA VALIDA: "+nota);
            nota = input.nextDouble();


        }


    }

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        double nota;
//
//        System.out.print("Digite uma nota entre zero e dez: ");
//        nota = scanner.nextDouble();
//
//        while (nota < 0 || nota > 10) {
//            System.out.println("Valor inválido. Por favor, digite uma nota entre zero e dez.");
//            System.out.print("Digite uma nota entre zero e dez: ");
//            nota = scanner.nextDouble();
//        }
//
//        System.out.println("Nota válida: " + nota);
//    }
//}