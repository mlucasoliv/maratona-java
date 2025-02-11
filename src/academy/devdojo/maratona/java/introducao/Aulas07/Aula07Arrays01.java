package academy.devdojo.maratona.java.introducao.Aulas07;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        int[] idades = new int[3]; //Arrays é sempre em tipo reference. (Somente tipos de referencia podem ser
        // inicializados com nulo.
        //E arrays são considerados objetos em memória.
        idades[0] = 21;
        idades[1] = 15;
        idades[2] = 3;

        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);
    }
}
