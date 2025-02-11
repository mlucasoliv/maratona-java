package academy.devdojo.maratona.java.introducao.AulasIniciais;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int age = 10;
        long numeroGrande = 10000L;
        Integer idade = 10;
        double salarioDouble = 2000.0D;
        float salarioFloat = 2500.0F;
        byte idadeByte = 127;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M'; //Tabela ASCII ou Unicode
        String nome = "Eu gosto de abacaxi";

        System.out.println(age);
        System.out.println("A idade é " + age + " anos");
        System.out.println(falso);
        System.out.println("char "+caractere);
        System.out.println(nome);
        System.out.println(idade.floatValue());

    }
}
