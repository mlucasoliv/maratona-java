package academy.devdojo.maratona.javacore.MInterfaces.dominio;

public interface DataLoader {
    void load();
    default void checkPermissions(){
        System.out.println("Fazendo Checagem de permissões...");
    }

    static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }
}
