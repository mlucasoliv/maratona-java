package academy.devdojo.maratona.java.AulasIniciais;

    /* Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salario>, na data <data>. */

public class Aula03TiposPrimitivosExercicios {

    public static void main(String[] args) {

        String nome = "Goku";
        String endereco = "Rua das Laranjeiras";
        String data = "17/1/2025";
        double salario = 1500.50;
        String relatorio = "Eu " +nome+ ", morando no endereço " +endereco+ ", confirmo que recebi o salário de "+salario+", na data "+data;

        System.out.println(relatorio);
    }  
}
