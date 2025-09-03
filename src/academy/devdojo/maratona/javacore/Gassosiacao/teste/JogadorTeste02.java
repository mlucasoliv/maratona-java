package academy.devdojo.maratona.javacore.Gassosiacao.teste;

import academy.devdojo.maratona.javacore.Gassosiacao.dominio.Jogador;
import academy.devdojo.maratona.javacore.Gassosiacao.dominio.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Seleção Brasileira");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
