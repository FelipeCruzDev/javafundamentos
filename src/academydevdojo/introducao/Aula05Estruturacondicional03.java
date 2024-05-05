package academydevdojo.introducao;

public class Aula05Estruturacondicional03 {
    public static void main(String[] args) {
        double salario = 6000;
        String mensagemDoar =  "Eu vou doar 500 pro felipe";
        String mensagemNaoDoar = "N vou doar";
        String resultado = salario > 5000 ? mensagemDoar: mensagemNaoDoar;
        System.out.println(resultado);
    }
}
