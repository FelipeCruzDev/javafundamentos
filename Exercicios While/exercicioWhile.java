package academy.aulas.maratonajava.introducao;
//IMPRIMA TODOS OS NUMEROS PARES DE 0 ATÉ 100
public class exercicioWhile {
    public static void main(String[] args) {
        int num = 0;
        while (num <= 100) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
            num++;
        }
    }
}