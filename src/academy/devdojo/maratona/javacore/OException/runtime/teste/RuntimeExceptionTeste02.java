package academy.devdojo.maratona.javacore.OException.runtime.teste;

import java.io.IOException;

public class RuntimeExceptionTeste02 {
    public static void main(String[] args) {
        System.out.println(divisao(1,0));

        System.out.println("Código finalizado");
    }

    private static int divisao(int a, int b){
        if(b == 0){
            throw new IllegalArgumentException("Argumento ilegal, não pode ser 0."); //Sempre bom utilizar as expressões mais específicas possíveis.
        }
        return a/b;
    }
}
