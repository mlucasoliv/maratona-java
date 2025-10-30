package academy.devdojo.maratona.javacore.LClassesAbstratas.dominio;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
        this.cargo = "Desenvolvedor";
    }
    @Override
    public void calculaBonus() {
        this.salario += this.salario * 0.05;
    }
}
