package academy.devdojo.maratona.javacore.NPolimorfismo.servico;

import academy.devdojo.maratona.javacore.NPolimorfismo.repositorio.Repositorio;

public class RepositorioMemória implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em memória...");
    }
}
