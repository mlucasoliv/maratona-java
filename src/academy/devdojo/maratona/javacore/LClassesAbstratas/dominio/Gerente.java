package academy.devdojo.maratona.javacore.LClassesAbstratas.dominio;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
        this.cargo = "Gerente";
    }
}
