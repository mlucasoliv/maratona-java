package Treinos.Simples.Simples;

public class Array {
    public static void main(String[] args) {
        int [] Array = {10,20,30,5,6,7,8,50,100,200};
        int contador = 0;

        for (int i = 0; i < Array.length; i++) {
            if (Array[i] > 10){
                contador++;
            }
        }

        System.out.println(contador);
    }
}
