package Treinos.Simples.Simples;

public class podeVotar {
    public static void main(String[] args) {
        int idade = 80;

        if(idade < 16){
            System.out.println("Não pode votar.");
        }
        else if(idade <= 16 && idade >= 18 || idade > 70){
            System.out.println("Você pode votar!");
        }
        else{
            System.out.println("O Voto é obrigatório.");
        }
    }
}
