package Treinos.Simples.Simples;

public class Fatorial {
    public static void main(String[] args) {
        //Escreva um programa que calcule o fatorial de um número (ex: 5! = 5×4×3×2×1 = 120)
        int n = 5;
        int fatorial = 1;
        int resultado = 0;

        for (int i = n; i > 0 ; i--) {
//            if(i == n - 1){
//                fatorial = (n * (n - 1));
//                resultado = fatorial;
//            }
//            else if (i != n){
//                fatorial = (resultado * (i));
//                resultado = fatorial;
//            }
            fatorial = fatorial * i;
        }

        System.out.println(fatorial);
    }
}
