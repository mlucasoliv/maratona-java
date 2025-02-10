package academy.devdojo.maratona.java.AulasIniciais;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int num1 = 10;
        int num2 = 20;
        double resultado = num1 / (double) num2;
        System.out.println(resultado);

        // %

        int resto = 21 % 7;
        System.out.println(resto);

        // < > <= >= == !=

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualAVinte = 10 == 20;
        boolean isDezDiferenteVinte = 10 != 20;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMaiorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualAVinte " + isDezIgualAVinte);
        System.out.println("isDezDiferenteVinte " + isDezDiferenteVinte);

        // &&(AND) - //(OR) - !(NOT)

        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612; //(Precisa que todas as condições sejam verdadeiras)
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381; //(Precisa que todas as condições sejam verdadeiras)
        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;

        System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);

        // = += -= *= /= %=

        double bonus = 1800;
        bonus += 2000;
        bonus -= 2000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        // ++ --
        int contador = 0;
        contador += 1; //Contador = contador + 1
        contador++;
        contador--;
        ++contador;
        --contador;
        int contador2 = 0;
        System.out.println(contador2++); //Primeiro Executa e depois inclementa
        System.out.println(++contador2); //Primeiro Inclementa e depois executa



    }
}
