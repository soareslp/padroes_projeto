package padroescomportamentais.memento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class ClienteTest {

    @Test
    void deveArmazenarEstados(){
        Cliente cliente = new Cliente();
        cliente.setEstado(ClienteEstadoCadastrado.getInstance());
        cliente.setEstado(ClienteEstadoAgendaMarcada.getInstance());
        assertEquals(2, cliente.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial(){
        Cliente cliente = new Cliente();
        cliente.setEstado(ClienteEstadoCadastrado.getInstance());
        cliente.setEstado(ClienteEstadoAgendaMarcada.getInstance());
        cliente.restauraEstado(0);
        assertEquals(ClienteEstadoCadastrado.getInstance(), cliente.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Cliente cliente = new Cliente();
        cliente.setEstado(ClienteEstadoCadastrado.getInstance());
        cliente.setEstado(ClienteEstadoAgendaMarcada.getInstance());
        cliente.setEstado(ClienteEstadoAgendaRemarcada.getInstance());
        cliente.setEstado(ClienteEstadoAgendaCancelada.getInstance());
        cliente.restauraEstado(2);
        assertEquals(ClienteEstadoAgendaRemarcada.getInstance(), cliente.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Cliente cliente = new Cliente();
            cliente.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }

}