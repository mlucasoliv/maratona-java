package Exercicios.Dio;

public class Exercicio5 {
    public static void main(String[] args) {
        double salario_minimo = 1518;
        double salario = 1200;

        if(salario >= salario_minimo){
            int contagem = 0;
            contagem = (int) (salario / salario_minimo);
            System.out.println("Esse usuário ganha o equivalente a "+contagem+" salários mínimos.");
        }

        else{
            System.out.println("Esse usuário ganha menos de um salário mínimo.");
        }
    }
}
