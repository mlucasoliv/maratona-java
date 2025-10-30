package academy.devdojo.maratona.javacore.LClassesAbstratas.teste;

import academy.devdojo.maratona.javacore.LClassesAbstratas.dominio.Desenvolvedor;
import academy.devdojo.maratona.javacore.LClassesAbstratas.dominio.Dono;
import academy.devdojo.maratona.javacore.LClassesAbstratas.dominio.Gerente;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Luffy", 5000);
        Dono dono = new Dono("Jin-woo", 7000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Ranma", 3500);

        gerente.imprime();
        System.out.println(gerente);
        dono.imprime();
        System.out.println(dono);
        desenvolvedor.imprime();
        System.out.println(desenvolvedor);
    }
}
