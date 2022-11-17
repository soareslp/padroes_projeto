import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import padroescomportamentais.state.Cliente;
import padroescomportamentais.state.ClienteEstadoCadastrado;

import static org.junit.jupiter.api.Assertions.assertEquals;

class lojaFakeTest {
    lojaFake lojaFake;
    @BeforeEach
    public void setUp() {
        lojaFake = new lojaFake();
        aceiteria = lojaFake.getTotal()
    }

    @Test
    public void nãoDeveCadastrarClienteCadastrado(){
        assertEquals(1.875, lojaFake.adrencia());
    }
}