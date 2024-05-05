package academydevdojo.introducao;

public class Aula06Estruturaderepeticaoexercicio {
    public static void main(String[] args) {
        //imprima todos os numeros pares de 0 ate 100

        for (int i = 1; i < 100; ++i) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}