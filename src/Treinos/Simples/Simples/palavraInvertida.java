package Treinos.Simples.Simples;

public class palavraInvertida {
    public static void main(String[] args) {
        String palavra = "Java";
        String invertida = "";

        for(int i = palavra.length() - 1; i != 0; i--){
            if(i == 0){
                invertida += palavra.charAt(i);
            }
            else{
                invertida += palavra.charAt(i);
            }
        }

        System.out.println("Palavra = " + palavra);
        System.out.println("Invertida = " + invertida);
    }
}
