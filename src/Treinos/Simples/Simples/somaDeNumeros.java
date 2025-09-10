package Treinos.Simples.Simples;

public class somaDeNumeros {
    public static void main(String[] args) {
        int resultado;
        int soma = 0;

        for (int i = 0; i < 50; i++) {
            soma += i;
        }

        resultado = soma;
        System.out.println(resultado);
    }
}
