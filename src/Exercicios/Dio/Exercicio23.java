package Exercicios.Dio;

public class Exercicio23 {
    public static void main(String[] args) {
        int francisco = 150;
        int sara = 110;
        int contador = 0;

        while (true) {
            if (francisco >= sara) {
                francisco += 2;
                sara += 3;
                contador++;
            }

            else{
                break;
            }
        }

        System.out.println("Será necessário " + contador + " anos.");
        System.out.println("Francisco: " + francisco);
        System.out.println("Sara: " + sara);

    }
}
