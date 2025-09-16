package Exercicios.Dio;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorTotal = 0;

        System.out.print("Digite o valor do produto: ");
        double valor = sc.nextDouble();

        System.out.println("Escolha a forma de pagamento: \n");
        System.out.println("1- À VISTA DINHEIRO OU PIX - 15%");
        System.out.println("2- À VISTA NO CRÉDITO - 10%");
        System.out.println("3- PARCELADO NO CARTÃO EM DUAS VEZES, PREÇO NORMAL SEM JUROS");
        System.out.println("4- PARCELADO NO CARTÃO EM TRES VEZES OU MAIS, PREÇO NORMAL DO PRODUTO MAIS JUROS DE 10%");
        int escolha = sc.nextInt();

        if(escolha == 1){
            double desconto = valor * 0.15;
            valorTotal = valor - desconto;

            System.out.println("Total a pagar: R$ "+valorTotal);
        }
        else if(escolha == 2){
            double desconto = valor * 0.10;
            valorTotal = valor - desconto;

            System.out.println("Total a pagar: R$ "+valorTotal);
        }
        else if(escolha == 3){
            valorTotal = valor;

            System.out.println("Total a pagar: R$ "+valorTotal);
        }
        else if(escolha == 4){
            double juros = valor * 0.10;
            valorTotal = valor + juros;

            System.out.println("Total a pagar: R$ "+valorTotal);
        }
    }
}
