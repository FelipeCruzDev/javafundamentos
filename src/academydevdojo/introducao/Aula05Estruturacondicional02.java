package academydevdojo.introducao;

public class Aula05Estruturacondicional02 {
    public static void main(String[] args) {
        int idade = 18;
        if (idade < 15){
            System.out.println("CATEGORIA INFANTIL");
        } else if (idade >=15 && idade < 18 ) {
            System.out.println("CATEGORIA JUNEVIL");
        }else  {
            System.out.println("CATEGORIA ADULTO");
        }
    }
}
