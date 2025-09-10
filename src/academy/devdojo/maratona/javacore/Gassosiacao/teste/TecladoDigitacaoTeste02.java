package academy.devdojo.maratona.javacore.Gassosiacao.teste;

import java.util.Scanner;

public class TecladoDigitacaoTeste02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Abacaxi que faz xixi");
        System.out.println("\nDigite sua pergunta e eu responderei se sim ou não...");
        String resposta = entrada.nextLine();
        if (resposta.charAt(0) == ' '){
            System.out.println("SIM");
        } else{
            System.out.println("NÃO");
        }
    }
}
