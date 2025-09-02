package academy.devdojo.maratona.javacore.Fmodificadoresestaticos.teste;

import academy.devdojo.maratona.javacore.Fmodificadoresestaticos.domain.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 153, 275);
        Carro c3 = new Carro("Fiat", 125, 250);
        Carro c2 = new Carro("Mercedes", 200, 290);

        Carro.setVelocidadeLimite(180);

        c1.imprime();
        c2.imprime();
        c3.imprime();

    }
}
