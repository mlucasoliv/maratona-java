package Treinos.Simples.Faculdade.Reposicao;

public class Medico extends Pessoa{
    private int crm;
    private String especialidade;

    public Medico(String nome, int rg, String genero, int crm, String especialidade) {
        super(nome, rg, genero);
        this.crm = crm;
        this.especialidade = especialidade;
    }

    public Medico() {

    }

    public void imprime(){
        System.out.println("------Dados do Médico------");
        super.imprime();
        System.out.println("CRM: " +this.crm);
        System.out.println("Especialidade: " +this.especialidade);
        System.out.println("----------------------------");
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
