package Treinos.Simples.Simples;

public class AlunosTeste {
    public static void main(String[] args) {
        Alunos aluno = new Alunos("Uzumaki", 15);
        Alunos aluno2 = new Alunos("Sakura", 15);
        Alunos aluno3 = new Alunos("Sasuke", 16);
        Alunos[] alunos = {aluno, aluno2, aluno3};

        for (int i = 0; i < alunos.length; i++) {
            System.out.println(alunos[i].getNome());
            System.out.println(alunos[i].getIdade());
        }
    }
}
