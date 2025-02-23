package academy.devdojo.maratona.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratona.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTeste {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Augusto";
        professor.idade = 40;
        professor.sexo = 'M';

        System.out.println("Nome " + professor.nome + " | Idade " + professor.idade + " | Sexo " + professor.sexo);
    }
}
