package academy.devdojo.maratona.javacore.Heranca.dominio;

public class Funcionario extends Pessoa{
    private String cargo;
    private double salario;

    static{
        System.out.println("Dentro do bloco de inicialização estático de funcionario.");
    }
    {
        System.out.println("Dentro do bloco de inicialização estático de funcionario2.");
    }
    {
        System.out.println("Dentro do bloco de inicialização estático de funcionario3.");
    }

    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construtor de Funcionário.");
    }

    public void imprime(){
        super.imprime();
        System.out.println("Salário: R$" +this.salario);
    }

    public void relatorioPagamento(){
        System.out.println("Eu " +this.nome+ " recebi um salário de R$" +this.salario);
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
