package academy.devdojo.maratona.java;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 17;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (!isAutorizadoComprarBebida) { // É como se fosse comparando, se não é autorizado == falso
            System.out.println("Não pode comprar a bebida.");
        }

        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcólica.");
        }

        boolean c = true;
        if(c = false){ //Só está associando, não está fazendo nenhuma comparação.
            System.out.println("Dentro de algo que nunca deve ser feito.");
        }
        if(c == false){ //Está comparando.
            System.out.println("Dentro de algo que nunca deve ser feito.");
        }
    }
}
