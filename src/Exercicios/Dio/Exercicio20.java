package Exercicios.Dio;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 10: ");
        int a = sc.nextInt();


        System.out.println("------ Tabuada do "+a+" ----------");
        for (int i = 0; i <= 10; i++) {
            System.out.println(a + " x " + i + " = " + (a * i));
        }

        }
    }

