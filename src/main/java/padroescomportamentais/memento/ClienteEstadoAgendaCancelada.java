package padroescomportamentais.memento;

public class ClienteEstadoAgendaCancelada implements ClienteEstado {

    private ClienteEstadoAgendaCancelada(){};
    private static ClienteEstadoAgendaCancelada instance= new ClienteEstadoAgendaCancelada();
    public static ClienteEstadoAgendaCancelada getInstance() {return instance;}

    @Override
    public String getEstado() {
        return "Agenda cancelada";
    }
}

