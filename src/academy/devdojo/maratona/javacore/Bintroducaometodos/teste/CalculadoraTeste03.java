package academy.devdojo.maratona.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratona.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20,2);
        System.out.println(result);
        System.out.println(calculadora.divideDoisNumeros3(20,2));
        System.out.println("================");
        calculadora.imprimeDivisaoDeDoisNumeros(20,0);
    }
}
