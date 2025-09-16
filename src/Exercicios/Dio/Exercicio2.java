package Exercicios.Dio;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro: ");
        int num = scanner.nextInt();

        if (num < 0){
            System.out.println("O número é negativo");
        }
        else if(num % 2 == 0){
            System.out.println("O numero é par");
        }
        else{
            System.out.println("O número é ímpar");
        }



    }
}
