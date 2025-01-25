package academy.devdojo.maratona.java;
//Quanto tenho de pagar de taxa na hollanda, de acordo com meu salário anual. (Baseada em 2020)
public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double anualSalary = 70000;
        double taxes;

        if (anualSalary < 34713){
            taxes = (anualSalary * 0.097);
        }
        else if(anualSalary >= 34713 && anualSalary <= 68507){
            taxes = (anualSalary * 0.3735);
        }
        else{
            taxes = (anualSalary * 0.4950);
        }
        System.out.println("O valor final das taxas é: " +taxes);
    }
}
