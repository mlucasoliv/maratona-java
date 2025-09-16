package Exercicios.Dio;

public class Exercicio15 {
    public static void main(String[] args) {
        int born = 2005;
        int dborn = 30;
        int mborn = 8;
        int dia = 16;
        int mes = 9;
        int ano = 2025;

        int anoTotal = ano - born;
        int mesTotal = 0;

        if(mes > mborn){
            mesTotal = mes - mborn;
        }
        else{
            anoTotal -= 1;
            mesTotal = 12 - (mborn - mes);
        }

        System.out.println(anoTotal+ " anos " +mesTotal+ " meses e " +dia+ " dias.");
    }
}
