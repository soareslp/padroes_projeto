package padroescomportamentais.interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class InterpretarNumeroTest {

    @Test
    void deveFormatarData(){
        Interpretador interpretador = new InterpretarData();
        assertEquals("14/10/1998", interpretador.interpretar("14101998"));
    }

    @Test
    void deveRetornarExcessao(){
        try {
            Interpretador interpretador = new InterpretarData();
            assertEquals("14/10/1998", interpretador.interpretar("14 de outubro de 1998"));
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Data inválida", e.getMessage());
        }
    }

}