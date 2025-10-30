package academy.devdojo.maratona.javacore.MInterfaces.testes;

import academy.devdojo.maratona.javacore.MInterfaces.dominio.DataBaseLoader;
import academy.devdojo.maratona.javacore.MInterfaces.dominio.DataLoader;
import academy.devdojo.maratona.javacore.MInterfaces.dominio.FileLoader;

public class DatabaseLoaderTeste01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        dataBaseLoader.load();
        fileLoader.load();

        dataBaseLoader.remove();
        fileLoader.remove();

        dataBaseLoader.checkPermissions();
        fileLoader.checkPermissions();

        DataLoader.retrieveMaxDataSize();
        DataBaseLoader.retrieveMaxDataSize();
    }
}
