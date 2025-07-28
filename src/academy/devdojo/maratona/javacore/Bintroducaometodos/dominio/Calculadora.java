package academy.devdojo.maratona.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public static void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public static void subtraiDoisNumeros() {
        System.out.println(20 - 15);
    }

    public static void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public int divideDoisNumeros(double num1, double num2) {
        return (int) (num1 / num2);
    }

    public double divideDoisNumeros2(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public double divideDoisNumeros3(double num1, double num2) {
        if (num2 != 0) {
            return 0;
        } else {
            return num1 / num2;
        }
    }

    public void imprimeDivisaoDeDoisNumeros (double num1, double num2){
        if (num2 == 0) {
            System.out.println("Não existe divisão por zero.");
        }else{
            System.out.println(num1 / num2);
        }
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1 "+num1);
        System.out.println("Num2 "+num2);
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for(int num: numeros){
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros){
        int soma = 0;
        for(int num: numeros){
            soma += num;
        }
        System.out.println(soma);
    }
}
