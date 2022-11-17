package padroescomportamentais.state;

public class ClienteEstadoAgendaMarcada implements ClienteEstado {

    private ClienteEstadoAgendaMarcada(){};
    private static ClienteEstadoAgendaMarcada instance= new ClienteEstadoAgendaMarcada();
    public static ClienteEstadoAgendaMarcada getInstance() {return instance;}

    @Override
    public String getEstado() {
        return "Agenda marcada";
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
        cliente.setEstado(ClienteEstadoAgendaRemarcada.getInstance());
        return "Reagendamento de horário do cliente realizada!";
    }

    @Override
    public String cancelarHorario(Cliente cliente) {
        cliente.setEstado(ClienteEstadoAgendaCancelada.getInstance());
        return "Cancelamento de horário do cliente realizado!";
    }
}
