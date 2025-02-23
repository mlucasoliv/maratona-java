package academy.devdojo.maratona.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratona.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Calculadora.somaDoisNumeros();
        Calculadora.subtraiDoisNumeros();
        System.out.println("Finalizar");
    }
}
