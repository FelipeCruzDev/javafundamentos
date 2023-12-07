package academy.aulas.maratonajava.javacore.Aintroducaoclasses.test;
import java.sql.SQLOutput;
import java.util.Scanner;
import academy.aulas.maratonajava.javacore.Aintroducaoclasses.dominio.CarrosExercicio;
/*
CRIE DOIS OBJETOS DISTINTOS.
 */
public class CarrosTest01Exercicio {
    public static void main(String[] args) {
        CarrosExercicio carros = new CarrosExercicio();
        CarrosExercicio carros2 = new CarrosExercicio();
        Scanner input = new Scanner(System.in);

        System.out.print("DIGITE SEU NOME: ");
        carros.nome = input.nextLine();
        System.out.print("DIGITE O MODELO DO SEU CARRO: ");
        carros.modelo = input.nextLine();
        System.out.print("DIGITE O ANO DO SEU CARRO: ");
        carros.ano = input.nextInt();
        input.nextLine(); // Consumir a nova linha pendente no buffer

        System.out.print("DIGITE SEU NOME: ");
        carros2.nome = input.nextLine();
        System.out.print("DIGITE O MODELO DO SEU CARRO: ");
        carros2.modelo = input.nextLine();
        System.out.print("DIGITE O ANO DO SEU CARRO: ");
        carros2.ano = input.nextInt();


        System.out.println(" \nPROPRIETARIO: "+carros.nome +" \nMODELO: "+carros.modelo+ " \nANO: "+carros.ano);
        System.out.println(" \nPROPRIETARIO: "+carros2.nome +" \nMODELO: "+carros2.modelo+ " \nANO: "+carros2.ano);
    }
}
