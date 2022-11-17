package padroescriacao.factorymethod.factory;

import padroescriacao.factorymethod.model.IServico;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class ServicoFactoryTest {

    @Test
    void deveRetornarExcecaoParaServicoInexistente() {
        try {
            IServico servico = ServicoFactory.obterServico("Ultrassom");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Servico inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaServicoInvalido() {
        try {
            IServico servico = ServicoFactory.obterServico("Cirurgia");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Servico inexistente", e.getMessage());
        }
    }

}