package padroescomportamentais.state;

public class ClienteEstadoAgendaRemarcada implements ClienteEstado {

    private ClienteEstadoAgendaRemarcada(){};
    private static ClienteEstadoAgendaRemarcada instance= new ClienteEstadoAgendaRemarcada();
    public static ClienteEstadoAgendaRemarcada getInstance() {return instance;}

    @Override
    public String getEstado() {
        return "Agenda remarcada";
    }

    @Override
    public String cadastrar(Cliente cliente) {
        return "Cliente não cadastrado!";
    }

    @Override
    public String agendarHorario(Cliente cliente) {
        return "Agenda de horário do cliente não realizada!";
    }

    @Override
    public String remarcarHorario(Cliente cliente) {
        return "Reagendamento de horário do cliente realizada!";
    }

    @Override
    public String cancelarHorario(Cliente cliente) {
        cliente.setEstado(ClienteEstadoAgendaCancelada.getInstance());
        return "Cancelamento de horário do cliente realizado!";
    }
}
