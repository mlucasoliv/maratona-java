package Exercicios.Dio;

public class Exercicio9 {
    public static void main(String[] args) {
        int peso = 65;
        double altura = 1.75;

        double imc = peso/(altura*altura);

        if(imc < 18.5){
            System.out.println("Abaixo do peso");
        }
        else if(imc >= 18.5 && imc <= 24.9){
            System.out.println("Peso ideal (parabéns)");
        }
        else if(imc >= 25 && imc <= 29.9){
            System.out.println("Levemente acima do peso.");
        }
        else if(imc >= 30 && imc <= 34.9){
            System.out.println("Obesidade grau 1");
        }
        else if(imc >= 35 && imc <= 39.9){
            System.out.println("Obesidade grau 2 (severa)");
        }
        else if(imc >= 40){
            System.out.println("Obesidade grau 3 (mórbida)");
        }
    }
}
