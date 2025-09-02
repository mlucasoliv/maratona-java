package academy.devdojo.maratona.javacore.Csobrecargametodos.teste;

import academy.devdojo.maratona.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTeste1 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Dragon Ball Daima", "TV", 24, "Ação");
        anime.setNota(5);
        anime.imprime();
    }
}
