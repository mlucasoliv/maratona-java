package academy.devdojo.maratona.javacore.OException.error.teste;

public class StackOverFlowTeste01 {
    public static void main(String[] args) {
        recursividade();
    }

    public static void recursividade(){
        recursividade();
    }
}
