package academy.devdojo.maratona.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratona.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroExercicioTeste {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.nome = "Fiat";
        carro.modelo = "Punto";
        carro.ano = 2024;

        Carro carro2 = new Carro();
        carro2.nome = "Toyota";
        carro2.modelo = "Brabo";
        carro2.ano = 2022;

        System.out.println("Carro 1: \n");
        System.out.println("Nome " + carro.nome + " | Modelo " + carro.modelo + " | Ano " + carro.ano);
        System.out.println("\n---------------------------------------------------------------------------\n");
        System.out.println("Carro 2: \n");
        System.out.println("Nome " + carro2.nome + " | Modelo " + carro2.modelo + " | Ano " + carro2.ano);

    }
}
