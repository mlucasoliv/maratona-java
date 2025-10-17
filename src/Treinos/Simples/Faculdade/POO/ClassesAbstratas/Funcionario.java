package Treinos.Simples.Faculdade.POO.ClassesAbstratas;

abstract class Funcionario {
    String nome;
    double salario;

    abstract double calcularBonus(); //Obrigatório para classes

    void exibirDados(){
        System.out.println("Nome: " +nome+ " - Salário: R$ "+salario);
        System.out.println("Bônus: " +calcularBonus());
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
}
