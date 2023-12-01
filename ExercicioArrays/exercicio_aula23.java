package academy.aulas.maratonajava.introducao;
import java.util.Scanner;

/*
dado um determinado salario anual quanto eu devo pagar de imposto
 */
//$0        $34,712     9.70%
//$34,713   $68,507     37.35%
//$68,508   49.50%
public class exercicio_aula23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("DIGITE O SEU SALARIO ANUAL: ");
        double salarioanual = input.nextDouble();
        double primeirafaixa = 9.70/100;
        double segundafaixa = 37.35/100;
        double terceirafaixa = 49.50/100;
        if (salarioanual <= 34712){
            double valorimposto = salarioanual*primeirafaixa;
            System.out.println("O IMPOSTO SERÁ DE: $"+valorimposto);
        }else if (salarioanual >= 34713 && salarioanual<= 68507){
            double valorimposto = salarioanual*segundafaixa;
            System.out.println("O IMPOSTO SERÁ DE: $"+valorimposto);
        }else {
            double valorimposto = salarioanual  * terceirafaixa;
            System.out.println("O IMPOSTO SERÁ DE: $"+valorimposto);
        }

    }
}
