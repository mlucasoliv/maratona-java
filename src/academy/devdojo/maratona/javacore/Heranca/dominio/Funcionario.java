package academy.devdojo.maratona.javacore.Heranca.dominio;

public class Funcionario extends Pessoa{
    private String cargo;
    private double salario;

    public Funcionario(){
    }

    public void imprime(){
        System.out.println("Salário: R$" +this.salario);
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
