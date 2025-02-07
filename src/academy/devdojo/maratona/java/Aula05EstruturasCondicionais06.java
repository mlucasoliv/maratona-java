package academy.devdojo.maratona.java;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Dado os valores de 1 a 7, utilizando switch, imprima se é dia útil ou final de semana.
        // Considerando 1 como domingo.

        byte dia = 10;

        switch (dia){
            default:
                System.out.println("Opção inválido");
                break;
            case 1:
                System.out.println("Fim de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            case 7:
                System.out.println("Fim de semana");
                break;
        }
    }
}
