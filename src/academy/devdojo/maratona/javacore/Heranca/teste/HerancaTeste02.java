package academy.devdojo.maratona.javacore.Heranca.teste;

import academy.devdojo.maratona.javacore.Heranca.dominio.Funcionario;

public class HerancaTeste02 {
    // 0- Bloco de inicialização estático da super classe é executado quando a JVM carregar a classe pai
    // 1- Bloco de inicialização estático da sub classe é executado quando a JVM carregar a classe filha
    // 2- Alocado espaço de memória pro objeto da superclasse
    // 3- Cada atributo de superclasse é criado e inicializado com valores default ou o que for passado da classe pai.
    // 4- Bloco de inicialização da superclasse é executado
    // 5- Construtor é executado da superclasse
    // 6- Alocado espaço de memória pro objeto da superclasse
    // 7- Cada atributo de superclasse é criado e inicializado com valores default ou o que for passado da classe pai.
    // 8- Bloco de inicialização da superclasse é executado
    // 9- Construtor é executado da superclasse
    public static void main(String[] args) {
        Funcionario Funcionario = new Funcionario("Jiraya");
    }
}
