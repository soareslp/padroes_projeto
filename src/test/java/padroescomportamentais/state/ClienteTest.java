package padroescomportamentais.state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClienteTest {

    Cliente cliente;
    @BeforeEach
    public void setUp() {cliente = new Cliente();}


    //Cliente Agenda Cadastrado
    @Test
    public void nãoDeveCadastrarClienteCadastrado(){
    cliente.setEstado(ClienteEstadoCadastrado.getInstance());
    assertEquals("Cliente não cadastrado!", cliente.cadastrar());
    }

    @Test
    public void deveAgendarHorarioClienteCadastrado(){
        cliente.setEstado(ClienteEstadoCadastrado.getInstance());
        assertEquals("Agenda de horário do cliente realizada!", cliente.agendarHorario());
    }

    @Test
    public void deveReagendarHorarioClienteCadastrado(){
        cliente.setEstado(ClienteEstadoCadastrado.getInstance());
        assertEquals("Reagendamento de horário do cliente realizada!", cliente.remarcarHorario());
    }

    @Test
    public void deveCancelarHorarioClienteCadastrado(){
        cliente.setEstado(ClienteEstadoCadastrado.getInstance());
        assertEquals("Cancelamento de horário do cliente não realizado!", cliente.cancelarHorario());
    }

    //Cliente Agenda Marcada
    @Test
    public void nãoDeveCadastrarClienteComAgendaMarcada(){
        cliente.setEstado(ClienteEstadoAgendaMarcada.getInstance());
        assertEquals("Cliente não cadastrado!", cliente.cadastrar());
    }

    @Test
    public void nãoDeveAgendarHorarioClienteComAgendaMarcada(){
        cliente.setEstado(ClienteEstadoAgendaMarcada.getInstance());
        assertEquals("Agenda de horário do cliente não realizada!", cliente.agendarHorario());
    }

    @Test
    public void deveReagendarHorarioClienteComAgendaMarcada(){
        cliente.setEstado(ClienteEstadoAgendaMarcada.getInstance());
        assertEquals("Reagendamento de horário do cliente realizada!", cliente.remarcarHorario());
    }

    @Test
    public void deveCancelarHorarioClienteComAgendaMarcada(){
        cliente.setEstado(ClienteEstadoAgendaMarcada.getInstance());
        assertEquals("Cancelamento de horário do cliente realizado!", cliente.cancelarHorario());
    }

    //Cliente Agenda Remarcada

    @Test
    public void nãoDeveCadastrarClienteComAgendaRemarcada(){
        cliente.setEstado(ClienteEstadoAgendaRemarcada.getInstance());
        assertEquals("Cliente não cadastrado!", cliente.cadastrar());
    }

    @Test
    public void nãoDeveAgendarHorarioClienteComAgendaRemarcada(){
        cliente.setEstado(ClienteEstadoAgendaRemarcada.getInstance());
        assertEquals("Agenda de horário do cliente não realizada!", cliente.agendarHorario());
    }

    @Test
    public void deveReagendarHorarioClienteComAgendaRemarcada(){
        cliente.setEstado(ClienteEstadoAgendaRemarcada.getInstance());
        assertEquals("Reagendamento de horário do cliente realizada!", cliente.remarcarHorario());
    }

    @Test
    public void deveCancelarHorarioClienteComAgendaRemarcada(){
        cliente.setEstado(ClienteEstadoAgendaRemarcada.getInstance());
        assertEquals("Cancelamento de horário do cliente realizado!", cliente.cancelarHorario());
    }


    //Cliente Agenda Cancelada
    @Test
    public void nãoDeveCadastrarClienteComAgendaCancelada(){
        cliente.setEstado(ClienteEstadoAgendaCancelada.getInstance());
        assertEquals("Cliente não cadastrado!", cliente.cadastrar());
    }

    @Test
    public void nãoDeveAgendarHorarioClienteComAgendaCancelada(){
        cliente.setEstado(ClienteEstadoAgendaCancelada.getInstance());
        assertEquals("Agenda de horário do cliente não realizada!", cliente.agendarHorario());
    }

    @Test
    public void deveReagendarHorarioClienteComAgendaCancelada(){
        cliente.setEstado(ClienteEstadoAgendaCancelada.getInstance());
        assertEquals("Reagendamento de horário do cliente não realizada!", cliente.remarcarHorario());
    }

    @Test
    public void deveCancelarHorarioClienteComAgendaCancelada(){
        cliente.setEstado(ClienteEstadoAgendaCancelada.getInstance());
        assertEquals("Cancelamento de horário do cliente não realizado!", cliente.cancelarHorario());
    }

}