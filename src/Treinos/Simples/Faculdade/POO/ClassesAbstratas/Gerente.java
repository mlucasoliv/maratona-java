package Treinos.Simples.Faculdade.POO.ClassesAbstratas;

public class Gerente extends Funcionario{

    @Override
    double calcularBonus() {
        return salario * 0.20;
    }

    public Gerente() {
    }
}
