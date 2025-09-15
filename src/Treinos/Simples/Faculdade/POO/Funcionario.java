package Treinos.Simples.Faculdade.POO;

public class Funcionario {
    private String nome;
    private double salario;
    private int cpf;

    public Funcionario(String nome, double salario, int cpf) {
        this.nome = nome;
        this.salario = salario;
        this.cpf = cpf;
    }

    public Funcionario() {
    }

    public void imprime(){
        System.out.println("--------------------\n");
        System.out.println("Nome = " + this.nome);
        System.out.println("CPF = " + this.cpf);
        System.out.println("Salário = R$ " + this.salario);
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

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
}
