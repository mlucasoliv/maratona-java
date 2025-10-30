package academy.devdojo.maratona.javacore.NPolimorfismo.teste;

import academy.devdojo.maratona.javacore.NPolimorfismo.dominio.Computador;
import academy.devdojo.maratona.javacore.NPolimorfismo.dominio.Televisao;
import academy.devdojo.maratona.javacore.NPolimorfismo.dominio.Tomate;
import academy.devdojo.maratona.javacore.NPolimorfismo.servico.CalcularImposto;

public class ProdutoTeste01 {
    public static void main(String[] args) {
        Computador computador = new Computador("PCI710", 11000);
        Tomate tomate = new Tomate("Tomate Cereja", 43);
        Televisao televisao = new Televisao("LG 60\" ", 5000);
        System.out.println("--------------------------");
        CalcularImposto.calcularImposto(tomate);
        System.out.println("--------------------------");
        CalcularImposto.calcularImposto(computador);
        System.out.println("--------------------------");
        CalcularImposto.calcularImposto(televisao);
    }
}
