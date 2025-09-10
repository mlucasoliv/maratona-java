package Treinos.Simples.Simples;

public class Verificacao {
    public static void main(String[] args) {
        // Imprima “Positivo” se for maior que 0
        //
        //“Negativo” se for menor que 0
        //
        //“Zero” se for igual a 0

        int numero = 0;

        if (numero > 0){
            System.out.println("Positivo");
        }
        else if(numero < 0){
            System.out.println("Negativo");
        }
        else if (numero == 0){
            System.out.println("Zero");
        }
    }
}
