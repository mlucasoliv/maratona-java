package Treinos.Simples.Faculdade.Reposicao;

import javax.swing.*;

public class Teste {
    public static void main(String[] args) {

        Paciente paciente = new Paciente();
        paciente.setNome("Pedro");
        paciente.setIdade(22);
        paciente.setRg(1234567);
        paciente.setGenero("NB");

        Medico medico = new Medico();
        medico.setCrm(12345);
        medico.setEspecialidade("Cirurgião Obstreta");
        medico.setNome("Luan Tavares Monteiro");
        medico.setIdade(50);
        medico.setRg(12321321);
        medico.setGenero("M");

        paciente.setNumeroProntuario(123);
        paciente.setDiagnostico("Pedro está com gases.");

        medico.imprime();

        JOptionPane.showMessageDialog(null, "teste de impressao");
        JOptionPane.showInputDialog("Inforome nome do paciente");

        System.out.println();
        paciente.imprime();
        paciente.imprimirDiagnostico();

    }
}
