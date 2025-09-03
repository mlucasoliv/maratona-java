package academy.devdojo.maratona.javacore.Fmodificadoresestaticos.domain;

public class Anime {
    private String nome;
    private static int[] episodios;

    // 0- Bloco de inicialização é executado quando a JVM carregar a classe
    // 1- Alocado espaço em memória pro objeto
    // 2- Cada atributo de classe ẽ criado e inicializado com valores default ou o que for passado
    // 3- Bloco de inicialização é executado
    // 4- Construtor é executado

    // Os blocos estáticos são gerados apenas uma vez quando a máaquina JVM está carregando a classe.
    static {
        System.out.println("Dentro do bloco de inicialização");

        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    static {
        System.out.println("Dentro do bloco de inicialização 2");
    }

    static {
        System.out.println("Dentro do bloco de inicialização 3");
    }
    // Blocos de instância, são carregados sempre que um objeto de classe é criado.
    {
        System.out.println("Dentro do bloco de inicialização não estático");
    }
    {
        System.out.println("Dentro do bloco de inicialização não estático 2");
    }
    {
        System.out.println("Dentro do bloco de inicialização não estático 3");
    }


    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio: Anime.episodios){
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
