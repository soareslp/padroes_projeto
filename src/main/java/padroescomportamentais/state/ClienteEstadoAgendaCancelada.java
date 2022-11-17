package padroescomportamentais.state;

public class ClienteEstadoAgendaCancelada implements ClienteEstado {

    private ClienteEstadoAgendaCancelada(){};
    private static ClienteEstadoAgendaCancelada instance= new ClienteEstadoAgendaCancelada();
    public static ClienteEstadoAgendaCancelada getInstance() {return instance;}

    @Override
    public String getEstado() {
        return "Agenda cancelada";
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
        return "Reagendamento de horário do cliente não realizada!";
    }

    @Override
    public String cancelarHorario(Cliente cliente) {
        return "Cancelamento de horário do cliente não realizado!";
    }
}
