package academydevdojo.introducao;
//Dado os valores 1 a 7 imprimia se é dia util ou final de semana
// Considerando 1 como domingo
public class Aula05EstruturacondicionalExercicio02 {
    public static void main(String[] args) {
    byte dia = 1;
    switch (dia){
        case 1:
            System.out.println("DOMINGO,FINAL DE SEMANA");
            break;
        case 2:
            System.out.println("SEGUNDA,DIA UTIL UTIL");
            break;
        case 3:
            System.out.println("TERÇA,DIA UTIL UTIL");
            break;
        case 4:
            System.out.println("QUARTA,DIA UTIL UTIL");
            break;
        case 5:
            System.out.println("QUINTA,DIA UTIL UTIL");
            break;
        case 6:
            System.out.println("SEXTA,DIA UTIL UTIL");
            break;
        case 7:
            System.out.println("SABADO,FINAL DE SEMANA");
            break;
        default:
            System.out.println("OPÇÃO INVALIDA");
            break;
    }
    }
}
