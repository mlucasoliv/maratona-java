package academy.devdojo.maratona.javacore.NPolimorfismo.teste;

import academy.devdojo.maratona.javacore.NPolimorfismo.repositorio.Repositorio;
import academy.devdojo.maratona.javacore.NPolimorfismo.servico.RepositorioBancoDeDados;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
    }
}
