package Exercicios.Dio;

public class Exercicio11 {
    public static void main(String[] args) {
        double[] notas = {4.5,7,3};
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            soma = soma + notas[i];
        }

        double media = soma / notas.length;

        if (media >= 7){
            System.out.println("O aluno está aprovado.");
        }
        else{
            System.out.println("O aluno foi reprovado.");
        }
    }
}
