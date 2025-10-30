package academy.devdojo.maratona.javacore.LClassesAbstratas.dominio;

public abstract class Funcionario extends Pessoa{
    protected String nome;
    protected double salario;
    protected String cargo;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", cargo=" + cargo +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract void calculaBonus();

    @Override
    public void imprime() {
        System.out.println("Imprimindo...");
    }
}
