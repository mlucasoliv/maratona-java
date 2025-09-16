package Exercicios.Dio;

public class Exercicio10 {
    public static void main(String[] args) {
        double[] notas = {10,8.5,5};
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            soma = soma + notas[i];
        }

        double media = soma / notas.length;

        System.out.println("A média do aluno foi de "+String.format("%.2f",media));
    }
}
