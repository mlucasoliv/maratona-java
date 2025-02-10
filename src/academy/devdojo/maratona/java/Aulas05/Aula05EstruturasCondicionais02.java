package academy.devdojo.maratona.java.Aulas05;

public class Aula05EstruturasCondicionais02 { //Bloco da classe
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade >= 18 categoria adulto
        int idade = 12;
        String categoria;

        if (idade <  15){
            categoria = "Categoria Infantil";
        }
        else if(idade >= 15 && idade < 18){
            categoria = "Categoria Juvenil";
        }
        else{
            categoria = "Categoria Adulta";
        }

        System.out.println(categoria);
    }
}
