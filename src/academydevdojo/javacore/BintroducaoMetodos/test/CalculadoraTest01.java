package academydevdojo.javacore.BintroducaoMetodos.test;

import academydevdojo.javacore.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Finalizando Adição");
        calculadora.subtraiDoisNumeros();
        System.out.println("Finalizando Subtração");

    }



}
