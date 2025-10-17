package academy.devdojo.maratona.javacore.Heranca.teste;

import academy.devdojo.maratona.javacore.Heranca.dominio.Endereco;
import academy.devdojo.maratona.javacore.Heranca.dominio.Funcionario;
import academy.devdojo.maratona.javacore.Heranca.dominio.Pessoa;

public class HerencaTeste01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua limonada");
        endereco.setCep("1234567");

        Pessoa pessoa = new Pessoa("Midoriya");
        pessoa.setCpf("12345678999");
        pessoa.setEndereco(endereco);

        Funcionario funcionario =  new Funcionario("Lucas");
        funcionario.setCpf("12345678999");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(3516);
        funcionario.setCargo("Gerente");
        funcionario.relatorioPagamento();

        funcionario.imprime();
        System.out.println("-------------------");
        pessoa.imprime();
    }
}
