package academy.devdojo.maratona.java;

public class Aula05EstruturasCondicionais03 { //Operador Ternário
    public static void main(String[] args) {
        // Doar se Salário > 5000
        double salario = 5001;
        // (condicao) ? verdadeiro : falso;

        String resultado = salario > 5000 ? "Eu vou doar 500 pro DevDojo" : "Ainda não tenho condições, mas irei ter!"; //Operador ternário precisa pegar a variável e colocar em algum lugar.
        //boolean possoDoar = salario > 5000 ? true : false;
        System.out.println(resultado);

        //Com três opções
        int idade = 5;
        String categoria;

        categoria = idade < 15 ? "Categoria Infantil" : idade >= 15 && idade < 18 ? "Categoria Juvenil" : "Categoria " +
                "Adulto"; //Não recomendado fazer assim, complicado e difícil de ler, mas só para mostrar que dá sim.
        System.out.println(categoria);
    }
}
