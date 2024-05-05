package academydevdojo.introducao;
//dado determinado salario anual, qual valor preciso pagar
public class Aula05EstruturacondicionalExercicio {
    public static void main(String[] args) {
        double salarioAnual = 75.519 ;
        double salarioTaxa1 = 36.97/100;
        double salarioTaxa2 = 49.50/100;

        if (salarioAnual <= 75518){
            System.out.println(salarioAnual*salarioTaxa1);
        }else{
            System.out.println(salarioAnual*salarioTaxa2);
        }
    }
}
