package Exercicios.Dio;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número A: ");
        int num = sc.nextInt();
        System.out.println("Digite um número B: ");
        int num2 = sc.nextInt();

        int quociente = num/num2;
        int resto = num%num2;

        System.out.println("Quociente: "+quociente);
        System.out.println("Resto: "+resto);
    }
}
