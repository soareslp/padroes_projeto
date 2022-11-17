package padroescomportamentais.memento;

public class ClienteEstadoAgendaRemarcada implements ClienteEstado {

    private ClienteEstadoAgendaRemarcada(){};
    private static ClienteEstadoAgendaRemarcada instance= new ClienteEstadoAgendaRemarcada();
    public static ClienteEstadoAgendaRemarcada getInstance() {return instance;}

    @Override
    public String getEstado() {
        return "Agenda remarcada";
    }
}

