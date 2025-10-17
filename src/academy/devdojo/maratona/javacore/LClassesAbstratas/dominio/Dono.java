package academy.devdojo.maratona.javacore.LClassesAbstratas.dominio;

public class Dono extends Funcionario {
    public Dono(String nome, double salario) {
        super(nome, salario);
        this.cargo = "Owner";
    }
}
