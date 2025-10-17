package academy.devdojo.maratona.javacore.Kenum.dominio;

public class Cliente {
    private String nome;
    private TipoCliente tipoCliente;
    public TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}