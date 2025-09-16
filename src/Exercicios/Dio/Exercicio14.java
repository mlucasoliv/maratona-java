package Exercicios.Dio;

public class Exercicio14 {
    public static void main(String[] args) {
        int a = 15;
        int b = 16;
        int c = 0;
        int d = 0;

        System.out.println("-----------------");
        System.out.println(a);
        System.out.println(b);
        System.out.println("------------------");
        c = a;
        d = b;
        a = d;
        b = c;
        System.out.println(a);
        System.out.println(b);
    }
}
