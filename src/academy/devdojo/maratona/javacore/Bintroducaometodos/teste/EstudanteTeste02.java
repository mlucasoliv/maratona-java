package academy.devdojo.maratona.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratona.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratona.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Midoriya";
        estudante01.idade = 15;
        estudante01.sexo= 'M';

        estudante02.nome = "Sakura";
        estudante02.idade = 16;
        estudante02.sexo= 'F';

        estudante01.imprime();
        estudante02.imprime();
    }
}
