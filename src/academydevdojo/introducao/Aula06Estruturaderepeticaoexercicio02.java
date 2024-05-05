package academydevdojo.introducao;
// dado um valor de um carro, descubra em quantas vezes ele pode ser parcelado
//valor da parcela maior ou igual a 1000
public class Aula06Estruturaderepeticaoexercicio02 {
    public static void main(String[] args) {
        double valor = 480000;

        for (int parcela = 0;parcela <=1000;parcela++){
            double valorparcela = valor/parcela;
            if (valorparcela<1000){
                break;
            }
            System.out.println("Parcela: "+ parcela + " R$: "+valorparcela);

        }
        }

    }

