package academy.devdojo.maratona.javacore.Kenum.teste;

import academy.devdojo.maratona.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratona.javacore.Kenum.dominio.TipoCliente;
import academy.devdojo.maratona.javacore.Kenum.dominio.TipoPagamento;

public class ClienteTeste01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Marcelo", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Gabriel", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println("O desconto no débito é de R$ " + TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println("O desconto no crédito é de R$ " + TipoPagamento.CREDITO.calcularDesconto(100));
    }
}
