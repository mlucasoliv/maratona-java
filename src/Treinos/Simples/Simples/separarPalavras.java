package Treinos.Simples.Simples;

public class separarPalavras {
    public static void main(String[] args) {
        String palavra = "Marcelo Lucas de Oliveira Lima";
        String[] letras = palavra.split(" ");

        for(String letra : letras){
            System.out.println(letra);
        }

    }
}
