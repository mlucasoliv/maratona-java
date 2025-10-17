package academy.devdojo.maratona.javacore.LClassesAbstratas.dominio;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
        this.cargo = "Desenvolvedor";
    }
}
