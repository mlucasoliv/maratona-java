package Exercicios.Dio;

public class Exercicio16 {
    public static void main(String[] args) {
        int num = 10;
        int num2 = 5;
        int num3 = 5;

        if(num == num2 && num == num3){
            System.out.println("Equilátero");
        }
        else if(num == num2 || num == num3 || num2 == num3) {
            System.out.println("Isóceles");
        }
        else if (num != num2 & num != num3 & num2 != num3){
            System.out.println("Escaleno");
        }
    }
}
