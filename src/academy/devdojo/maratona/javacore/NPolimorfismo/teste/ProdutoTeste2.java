package academy.devdojo.maratona.javacore.NPolimorfismo.teste;

import academy.devdojo.maratona.javacore.NPolimorfismo.dominio.Computador;
import academy.devdojo.maratona.javacore.NPolimorfismo.dominio.Produto;
import academy.devdojo.maratona.javacore.NPolimorfismo.dominio.Tomate;
import academy.devdojo.maratona.javacore.NPolimorfismo.servico.CalcularImposto;

public class ProdutoTeste2 {
    public static void main(String[] args) {
        Produto produto = new Computador("PCI710", 11000);

        Tomate tomate = new Tomate("Tomate Cereja", 43);
        tomate.setDataValidade("1/1/1");

        CalcularImposto.calcularImposto(tomate);
        System.out.println("----------------");
        CalcularImposto.calcularImposto(produto);

    }

}
