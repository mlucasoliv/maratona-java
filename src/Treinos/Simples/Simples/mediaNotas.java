package Treinos.Simples.Simples;

public class mediaNotas {
    public static void main(String[] args) {
        double [] arrayNotas= {5,4,10,3};
        double soma = 0;
        int tamanho = arrayNotas.length;
        int contador = 0;
        int acimaNotas = 0;

        for (double nota : arrayNotas) {
            soma += nota;
        }

        for (double arrayNota : arrayNotas) {
            if (arrayNota < 7) {
                contador = contador + 1;
            }
        }

        for (double notaAcima : arrayNotas){
            if (notaAcima> 7){
                acimaNotas += 1;
            }
        }

        double media = (soma/tamanho);

        System.out.println("Sua média foi de: "+media);
        System.out.println("Você teve um total de " +contador+ " matérias com nota baixa.");
        System.out.println("Você teve um total de " +acimaNotas+ " matérias com nota acima da média.");

    }
}
