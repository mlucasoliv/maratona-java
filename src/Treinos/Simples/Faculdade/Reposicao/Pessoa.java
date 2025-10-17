package Treinos.Simples.Faculdade.Reposicao;

public class Pessoa {
    private String nome;
    private int rg;
    private int idade;
    private String genero;

    public Pessoa(String nome, int rg, String genero) {
        this.nome = nome;
        this.rg = rg;
        this.genero = genero;
    }

    public Pessoa() {

    }

    public void imprime(){
        System.out.println();
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("RG: "+this.rg);
        System.out.println("Gênero: "+this.genero);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
