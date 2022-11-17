package padroesestruturais.facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClienteTest {

    @Test
    void deveRetornarPendenciaConsultorioAlta() {
        Cliente cliente = new Cliente();
        Consultorio.getInstancia().addClienteComPendencia(cliente);

        assertEquals(false, cliente.alta());
    }

    @Test
    void deveRetornarPendenciaLaboratorioAlta() {
        Cliente cliente = new Cliente();
        Laboratorio.getInstancia().addClienteComPendencia(cliente);

        assertEquals(false, cliente.alta());
    }

    @Test
    void deveRetornarPendenciaFinanceiroAlta() {
        Cliente cliente = new Cliente();
        Financeiro.getInstancia().addClienteComPendencia(cliente);

        assertEquals(false, cliente.alta());
    }

    @Test
    void deveRetornarClienteSemPendenciaFormatura() {
        Cliente cliente = new Cliente();

        assertEquals(true, cliente.alta());
    }

}