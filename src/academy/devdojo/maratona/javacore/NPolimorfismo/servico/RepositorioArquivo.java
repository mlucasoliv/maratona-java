package academy.devdojo.maratona.javacore.NPolimorfismo.servico;

import academy.devdojo.maratona.javacore.NPolimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em arquivo...");
    }
}
