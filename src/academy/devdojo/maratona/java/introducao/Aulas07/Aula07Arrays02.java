package academy.devdojo.maratona.java.introducao.Aulas07;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // Padrão de inicialização, variáveis declaradas fora do indice.
        // byte, short, int, long, float e double = 0
        // char = '\u0000' ' ' (padrão em branco)
        // boolean = false
        // String = null

        String [] nomes = new String[4];
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
