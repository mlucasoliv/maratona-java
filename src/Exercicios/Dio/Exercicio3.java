package Exercicios.Dio;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro: ");
        int num = sc.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        int num2 = sc.nextInt();



        if (num2 == num){
            int resultado = num2 + num;
            System.out.println("A soma de " +num+ " e " +num2+ " é igual a " +resultado);
        }

        else{
            int resultado = num2 * num;
            System.out.println("A multiplicação de " +num+ " e " +num2+ " é igual a " +resultado);
        }
    }
}
