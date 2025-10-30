package academy.devdojo.maratona.javacore.OException.exception.teste;

import java.io.File;
import java.io.IOException;

public class ExceptionTeste01 {
    public static void main(String[] args) throws IOException{
        criarNovoArquivo();
    }

    private static void criarNovoArquivo(){
        File file = new File("arquivo" + File.separator + "teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado " +isCriado);
        } catch (IOException e){
            e.printStackTrace();// Vai sair imprimindo tudo que ocorrer na stack para conseguir saber o erro que deu.
            //evitar colocar regra de negócio no código.
        }
    }
}
