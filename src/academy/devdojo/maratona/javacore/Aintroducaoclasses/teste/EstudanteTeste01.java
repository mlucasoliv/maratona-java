package academy.devdojo.maratona.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratona.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante(); //Variável estudante fazendo referência para um objeto do tipo estudante.
        estudante.nome = "Marcelo";
        estudante.idade = 19;
        estudante.sexo = 'M';
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
