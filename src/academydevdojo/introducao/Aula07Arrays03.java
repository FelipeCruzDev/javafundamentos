package academydevdojo.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        String [] nomes = {"goku","naturo"};
        for (int i = 0; i < nomes.length;i++){
            System.out.println(nomes[i]);
        }

        //foreach
        //Tem que ser o msm tipo de ARRAY
        for(String nome : nomes){

            System.out.println(nome);
        }
    }
}
