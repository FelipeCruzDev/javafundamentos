package academy.aulas.maratonajava.javacore.Aintroducaoclasses.test;
import java.util.Scanner;
import academy.aulas.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        Scanner imput = new Scanner(System.in);
        System.out.println("DIGITE SEU NOME: ");
        professor.nome = imput.nextLine();
        System.out.println("DIGITE Sua idade: ");
        professor.idade = imput.nextInt();
        System.out.println("DIGITE SEU SEXO: ");
        professor.sexo = imput.next().charAt(0);

        System.out.println("BELO NOME "+professor.nome+",VOCÊ APARENTA SER MUITO NOVO PARA QUEM TEM "+ professor.idade + "ANOS.");

    }


}
