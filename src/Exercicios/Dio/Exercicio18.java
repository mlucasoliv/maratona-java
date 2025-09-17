package Exercicios.Dio;

import java.util.Random;

public class Exercicio18 {
    public static void main(String[] args) {
        Random aleatorio = new Random();

        int numero = aleatorio.nextInt(100) + 1;
        System.out.println("Número aleatório (1-100): " + numero);
    }
}