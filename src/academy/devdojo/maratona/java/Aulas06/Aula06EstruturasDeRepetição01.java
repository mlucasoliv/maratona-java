package academy.devdojo.maratona.java.Aulas06;

public class Aula06EstruturasDeRepetição01 {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;
        while (count < 10) { //Trabalha com condições
            System.out.println(++count);
        }

        count = 0;
        do {
            System.out.println("Dentro do do-while " + ++count);
            // iniciado.
        } while (count < 10);

        for (count = 1; count < 10; count++) { //Geralmente trabalha com índices, mais utilizado para contagens.
            System.out.println("For "+count);
        }
    }
}
