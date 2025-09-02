package academy.devdojo.maratona.javacore.Eblocosdeinicializacao.teste;

import academy.devdojo.maratona.javacore.Eblocosdeinicializacao.domain.Anime;

public class AnimeTeste {
    public static void main(String[] args) {
        Anime anime = new Anime("One piece");

        for (int episodio : anime.getEpisodios()){
            System.out.print(episodio + " ");
        }
    }
}
