package academy.devdojo.maratona.javacore.Fmodificadoresestaticos.domain;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250; // Static tem que vir antes do tipo

    // Alterou para todas as instâncias do carro

    public Carro(String nome, double velocidadeMaxima, double velocidadeLimite) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public void imprime(){
        System.out.println("---------------");
        System.out.println("Nome " +this.nome);
        System.out.println("Velocidade Máxima " + this.velocidadeMaxima);
        System.out.println("Velocidade Limite " + Carro.velocidadeLimite);
    }

    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

}


