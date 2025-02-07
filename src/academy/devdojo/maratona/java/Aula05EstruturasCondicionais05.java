public class Aula05EstruturasCondicionais05 {

    public static void main(String[] args) {
        // Imprima o dia da semana, considerando 1 como domingo

        byte dia = 8;
        // char, int, byte, short, enum, String

        switch(dia){
            default:
                System.out.println("Opção inválida");
                break;
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
        }
        char sexo = 'M';
        switch (sexo){
            default:
                System.out.println("Sexo inválido");
                break;
            case 'M':
                System.out.println("Sexo masculino");
                break;
            case 'F':
                System.out.println("Sexo feminino");
                break;
        }
    }
}

