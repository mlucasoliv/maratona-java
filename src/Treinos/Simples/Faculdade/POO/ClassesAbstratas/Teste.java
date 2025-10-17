package Treinos.Simples.Faculdade.POO.ClassesAbstratas;

public class Teste {
    public static void main(String[] args) {
        Estagiario e1 = new Estagiario();
        Gerente g1 = new Gerente();

        g1.setNome("Limonada");
        e1.setNome("Alexandre");

        g1.setSalario(6410);
        e1.setSalario(3540);


        System.out.println("--------------- Resultados -------------");
        e1.exibirDados();
        g1.exibirDados();
    }
}