package Exercicios.Dio;

public class Exercicio7 {
    public static void main(String[] args) {
        boolean valor1 = true;
        boolean valor2 = true;
        boolean vdd = true;
        boolean fl = false;

        if (valor1 == vdd){
            if (valor2 == vdd){
                System.out.println("Os dois são verdadeiros.");
            }
            else{
                System.out.println("Os dois são diferentes.");
            }
        }
        else if(valor1 == fl){
            if (valor2 == fl){
                System.out.println("Os dois são falsos");
            }
            else{
                System.out.println("Os dois são diferentes.");
            }
        }
    }
}
