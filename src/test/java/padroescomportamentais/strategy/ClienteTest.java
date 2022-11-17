package padroescomportamentais.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class ClienteTest {

    @Test
    void deveSerPagoPorBoleto() {
        Cliente cliente = new Cliente("Lucas", "Boleto");
        cliente.pagarBoleto("Boleto");
        assertEquals("Pagamento por boleto", cliente.getTipoPagamento());
    }

    @Test
    void pdeveSerPagoPorCredito() {
        Cliente cliente = new Cliente("Lucas", "Credito");
        cliente.pagarCredito("Credito");
        assertEquals("Pagamento por crédito", cliente.getTipoPagamento());
    }

    @Test
    void deveSerPagoPorDebito() {
        Cliente cliente = new Cliente("Lucas", "Debito");
        cliente.pagarDebito("Debito");
        assertEquals("Pagamento por débito", cliente.getTipoPagamento());
    }

    @Test
    void deveSerPagoPorDinheiro() {
        Cliente cliente = new Cliente("Lucas", "Dinheiro");
        cliente.pagarDinheiro("Dinheiro");
        assertEquals("Pagamento por dinheiro", cliente.getTipoPagamento());
    }

    @Test
    void deveSerPagoPorPix() {
        Cliente cliente = new Cliente("Lucas", "Pix");
        cliente.pagarPix("Pix");
        assertEquals("Pagamento por pix", cliente.getTipoPagamento());
    }

    @Test
    void deveAcusarTipoPagamentoNãoSelecionado() {
        try {
            Cliente cliente = new Cliente("Lucas", "");
            cliente.pagarBoleto("");
            cliente.pagarCredito("");
            cliente.pagarDebito("");
            cliente.pagarDinheiro("");
            cliente.pagarPix("");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Forma de pagamento não selecionada!", e.getMessage());
        }
    }
}