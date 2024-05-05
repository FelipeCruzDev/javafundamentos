package academydevdojo.javacore.Aintroducaoclasses.dominio;

import academydevdojo.javacore.Aintroducaoclasses.model.Carro;

public class CarroTest02 {
    public static void main(String[] args) {

        Carro carro01 = new Carro();
        Carro carro02 = new Carro();
        carro01.nome = "CAÇA XEXEIRO";
        carro01.modelo = "MONZA";
        carro01.ano = 1997;

        carro02.nome = "CAÇA PIUPIU";
        carro02.modelo = "FERRARI";
        carro02.ano = 2010;

        System.out.println(carro01.nome + "\n"+ carro01.modelo + "\n"+carro01.ano);
        System.out.println("---------------------");
        System.out.println(carro02.nome + "\n"+ carro02.modelo + "\n"+carro02.ano);



    }
}
