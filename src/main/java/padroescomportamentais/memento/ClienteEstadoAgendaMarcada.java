package padroescomportamentais.memento;

public class ClienteEstadoAgendaMarcada implements ClienteEstado {

    private ClienteEstadoAgendaMarcada(){};
    private static ClienteEstadoAgendaMarcada instance= new ClienteEstadoAgendaMarcada();
    public static ClienteEstadoAgendaMarcada getInstance() {return instance;}

    @Override
    public String getEstado() {
        return "Agenda marcada";
    }
}

