package academy.devdojo.maratona.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratona.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTeste01{
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Rivian");
        funcionario.setIdade(20);
        funcionario.setSalarios(new double[] {1518, 2060, 3517});
        funcionario.imprime();
        System.out.println("Média " + funcionario.getMedia());

    }
}
