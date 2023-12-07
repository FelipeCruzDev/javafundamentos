package academy.aulas.maratonajava.javacore.Bintroducaometodos.dominio;
import java.util.Scanner;
public class Calculadora {
    public void somaDoisNumeros(){
        Scanner input = new Scanner (System.in);
        System.out.println("DIGITE UM NUMERO: ");
        float result = input.nextFloat();
        System.out.println("DIGITE UM NUMERO: ");
        float result2 = input.nextFloat();
        float soma = result + result2;
        System.out.println(soma);
    }
    public void subtraiDoisNumeros(){
        Scanner input = new Scanner (System.in);
        System.out.println("DIGITE UM NUMERO: ");
        float result = input.nextFloat();
        System.out.println("DIGITE UM NUMERO: ");
        float result2 = input.nextFloat();
        float sub = result - result2;
        System.out.println(sub);
    }
    public void multiplicaDoisNumeros(int num1,int num2){
        System.out.println(num1+num2);

    }
}
