package academydevdojo.introducao;
import java.text.NumberFormat;
import java.text.DecimalFormat;


// Criar um programa que calcule a média de salários de uma empresa,
// pedindo ao usuário a grade de funcionários e os salários, e devolvendo a média salarial.
public class exercicio02 {
    public static void main(String[] args) {
       int quantFunc = 4;
       double n1,n2,n3,n4,result;
        n1 = 3453.21;
        n2 = 3498.43;
        n3 = 7902.09;
        n4 = 12932.00;
        result = (n1+n2+n3+n4)/quantFunc;
        DecimalFormat df = new DecimalFormat("0.##");
        String dx = df.format(result);
        System.out.println("A média salarial da sua empresa é: "+NumberFormat.getCurrencyInstance().format(result));
        System.out.println(dx);
    }
}
