package padroescomportamentais.memento;

public class ClienteEstadoCadastrado implements ClienteEstado {

    private ClienteEstadoCadastrado(){};
    private static ClienteEstadoCadastrado instance= new ClienteEstadoCadastrado();
    public static ClienteEstadoCadastrado getInstance() {return instance;}

    @Override
    public String getEstado() {
        return "Cadastrado";
    }
}

