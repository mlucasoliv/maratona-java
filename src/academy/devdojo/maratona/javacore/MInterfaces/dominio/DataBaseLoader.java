package academy.devdojo.maratona.javacore.MInterfaces.dominio;

public class DataBaseLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados...");
    }

    @Override
    public void remove() {
        System.out.println("Removendo do Banco de dados...");
    }

    @Override
    public void checkPermissions() {
        System.out.println("Checando as permissões do banco de dados...");;
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na classe DataBaseLoader");
    }
}
