package academy.devdojo.maratona.java.introducao.Aulas06;

public class Aula06EstruturasDeRepetição02 {
    public static void main(String[] args) {
        //Imprima todos os números pares de 0 até 100000000

        int count;

        for (count = 0; count < 1000; count++) {
            if (count % 2 == 0) {
                System.out.println(count);
            }
        }
    }
}