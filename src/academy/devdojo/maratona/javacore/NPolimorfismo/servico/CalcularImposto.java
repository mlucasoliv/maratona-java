package academy.devdojo.maratona.javacore.NPolimorfismo.servico;

import academy.devdojo.maratona.javacore.NPolimorfismo.dominio.Computador;
import academy.devdojo.maratona.javacore.NPolimorfismo.dominio.Produto;
import academy.devdojo.maratona.javacore.NPolimorfismo.dominio.Tomate;

public class CalcularImposto {

    public static void calcularImposto(Produto produto){
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " +produto.getNome());
        System.out.println("Valor: R$ " +produto.getValor());
        System.out.println("Imposto a ser pago: R$ " +imposto);
        if(produto instanceof Tomate){
            System.out.println(((Tomate) produto).getDataValidade());
        }
    }
}
