package Treinos.Simples.Faculdade.Reposicao;

public class Paciente extends Pessoa{
    private int numeroProntuario;
    private String diagnostico;

    public Paciente() {

    }

    public Paciente(String nome, int rg, String genero) {
        super(nome, rg, genero);

    }

    public void imprime(){
        System.out.println("------Dados do Paciente------");
        super.imprime();
        System.out.println();
    }

    public void imprimirDiagnostico(){
        System.out.println("-------Diagnóstico do Paciente------");
        System.out.println("Número Prontuário: " +this.numeroProntuario);
        System.out.println("Diagnóstico: " +this.diagnostico);
    }


    public int getNumeroProntuario() {
        return numeroProntuario;
    }

    public void setNumeroProntuario(int numeroProntuario) {
        this.numeroProntuario = numeroProntuario;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }
}
