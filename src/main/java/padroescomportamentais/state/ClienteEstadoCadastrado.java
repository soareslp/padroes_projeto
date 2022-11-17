package padroescomportamentais.state;

public class ClienteEstadoCadastrado implements ClienteEstado {

    private ClienteEstadoCadastrado(){};
    private static ClienteEstadoCadastrado instance= new ClienteEstadoCadastrado();
    public static ClienteEstadoCadastrado getInstance() {return instance;}

    @Override
    public String getEstado() {
        return "Cadastrado";
    }

    @Override
    public String cadastrar(Cliente cliente) {
        return "Cliente não cadastrado!";
    }

    @Override
    public String agendarHorario(Cliente cliente) {
        cliente.setEstado(ClienteEstadoAgendaMarcada.getInstance());
        return "Agenda de horário do cliente realizada!";
    }

    @Override
    public String remarcarHorario(Cliente cliente) {
        cliente.setEstado(ClienteEstadoAgendaRemarcada.getInstance());
        return "Reagendamento de horário do cliente realizada!";
    }

    @Override
    public String cancelarHorario(Cliente cliente) {
        return "Cancelamento de horário do cliente não realizado!";
    }
}
