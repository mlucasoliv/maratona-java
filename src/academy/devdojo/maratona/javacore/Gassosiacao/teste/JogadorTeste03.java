package academy.devdojo.maratona.javacore.Gassosiacao.teste;

import academy.devdojo.maratona.javacore.Gassosiacao.dominio.Jogador;
import academy.devdojo.maratona.javacore.Gassosiacao.dominio.Time;

public class JogadorTeste03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Neymar");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador, jogador2};

        jogador.setTime(time);
        time.setJogadores(jogadores);
        jogador2.setTime(time);

        System.out.println("----Jogador----");

        jogador.imprime();

        System.out.println("----Jogador 2----");

        jogador2.imprime();

        System.out.println("----Time----");

        time.imprime();


    }
}
