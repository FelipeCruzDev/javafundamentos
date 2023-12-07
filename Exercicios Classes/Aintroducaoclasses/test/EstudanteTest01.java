package academy.aulas.maratonajava.javacore.Aintroducaoclasses.test;

import academy.aulas.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante(); //CRIANDO VARIAVEL DE REFERENCIA DO TIPO ESTUDANTE E OBJETO DO TIPO ESTUDANTE
        estudante.nome = "Goku";
        estudante.idade = 43;
        estudante.sexo = 'M';
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
