package Treinos.Simples.Faculdade.POO;

public class TestarGeranca {
    public static void main(String[] args) {
        Gerente gerenteBanco = new Gerente();
        gerenteBanco.setNome("Marcelo");
        gerenteBanco.setCpf(129345678);
        gerenteBanco.setSalario(5637);

        Funcionario funcionarioBanco = new Funcionario();
        funcionarioBanco.setNome("Pedro");
        funcionarioBanco.setCpf(12345678);
        funcionarioBanco.setSalario(1518);

        gerenteBanco.imprime();
        funcionarioBanco.imprime();
    }
}
