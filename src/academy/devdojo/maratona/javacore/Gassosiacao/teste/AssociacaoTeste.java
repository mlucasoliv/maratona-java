package academy.devdojo.maratona.javacore.Gassosiacao.teste;

import academy.devdojo.maratona.javacore.Gassosiacao.dominio.Aluno;
import academy.devdojo.maratona.javacore.Gassosiacao.dominio.Local;
import academy.devdojo.maratona.javacore.Gassosiacao.dominio.Professor;
import academy.devdojo.maratona.javacore.Gassosiacao.dominio.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Rua das árvores");
        Aluno aluno = new Aluno("Naruto", 15);
        Aluno aluno2 = new Aluno("Sakura", 16);
        Aluno aluno3 = new Aluno("Sasuke", 14);
        Professor professor = new Professor("Kakashi", "Ninja");
        Aluno[] alunosParaSeminario = {aluno, aluno2, aluno3};

        Seminario seminario = new Seminario("A arte dos Jutsus", alunosParaSeminario, local);
        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
