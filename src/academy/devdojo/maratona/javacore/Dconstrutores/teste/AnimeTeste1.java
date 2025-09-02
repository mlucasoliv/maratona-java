package academy.devdojo.maratona.javacore.Dconstrutores.teste;

import academy.devdojo.maratona.javacore.Dconstrutores.dominio.Anime;

public class AnimeTeste1 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu", "TV",25,"Esporte",5, "MadHouse");
        anime.imprime();
    }
}
