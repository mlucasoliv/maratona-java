package Exercicios.Dio;

public class Exercicio22 {
    public static void main(String[] args) {
        int aulas_lecionadas = 22;
        int hora_aula_pdia = 4;
        int valor_hora_aula = 70;

        double salarioTotal = ((hora_aula_pdia * aulas_lecionadas) * valor_hora_aula);

        if (salarioTotal <= 1518){
            salarioTotal = salarioTotal - (salarioTotal*0.075);
        }
        else if (salarioTotal <= 2793.88){
            salarioTotal = salarioTotal - (salarioTotal*0.09);
        }
        else if (salarioTotal <= 4190.83){
            salarioTotal = salarioTotal - (salarioTotal*0.12);
        }
        else if (salarioTotal <= 8157.41){
            salarioTotal = salarioTotal - (salarioTotal*0.14);
        }

        System.out.println("Salário Líquido do Professor é de: " +salarioTotal);
    }
}
