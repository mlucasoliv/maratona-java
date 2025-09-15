package Treinos.Simples.Faculdade.POO;

public class Gerente extends Funcionario{
    private int senha;

    public Gerente(String nome, double salario, int cpf) {
        super(nome, salario, cpf);
    }

    public Gerente() {
    }

    public boolean autentica(int testarSenha){
        if(testarSenha == senha){
            System.out.println("Acesso permitido.");
            return true;
        }
        else{
            System.out.println("Acesso negado.");
            return false;
        }
    }
}
