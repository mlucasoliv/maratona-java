package academy.devdojo.maratona.javacore.Heranca.dominio;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    static{
        System.out.println("Dentro do bloco de inicialização estático de pessoa.");
    }
    {
        System.out.println("Dentro do bloco de inicialização estático de pessoa2.");
    }
    {
        System.out.println("Dentro do bloco de inicialização estático de pessoa3.");
    }

    public Pessoa(String nome){
        System.out.println("Dentro do construtor de pessoa");
        this.nome = nome;
    }

    public Pessoa(String nome, String cpf){
        this(nome);
        this.cpf = cpf;
    }

    public void imprime(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Cpf: "+this.cpf);
        System.out.println("Endereço: "+this.endereco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
