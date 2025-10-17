package Treinos.Simples.Faculdade.POO.ClassesAbstratas;

public class Estagiario extends Funcionario {

    @Override
    double calcularBonus() {
        return salario * 0.05;
    }

    public Estagiario() {
    }
}
