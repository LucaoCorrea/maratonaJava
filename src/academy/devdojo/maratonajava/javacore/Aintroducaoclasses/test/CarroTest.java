package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        carro1.nome = "Honda Civic";
        carro1.modelo = "86";
        carro1.ano = 1986;

        carro2.nome = "Ford Ka";
        carro2.modelo = "Sedan";
        carro2.ano = 2016;

        //Referencia de objetos
        carro1 = carro2;


        System.out.println(carro1.nome + " " + carro1.modelo + " " + carro1.ano);
        System.out.println(carro2.nome + " " + carro2.modelo + " " + carro2.ano);
    }
}
