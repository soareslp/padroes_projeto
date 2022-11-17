package padroesestruturais.proxy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class ClienteProxyTest {

    @BeforeEach
    void setUp() {
        BD.addCliente(new Cliente(1, "Lucas", "Cachorro", "Rá", 500.0f));
        BD.addCliente(new Cliente(2, "Diogo", "Gato", "Lunna", 150.0f));
        BD.addCliente(new Cliente(3, "Henrique", "Cachorro", "Den",50.0f));
        BD.addCliente(new Cliente(4, "Guilherme", "Cachorro", "Charlie",100.0f));
    }

    @Test
    void deveRetornarDadosPessoaisAluno() {
        ClienteProxy cliente = new ClienteProxy(1);
        assertEquals(Arrays.asList("Lucas", "Cachorro", "Rá"), cliente.obterDadosPessoais());
    }

    @Test
    void deveRetornarValoConsultaCliente() {
        Funcionario funcionario = new Funcionario("José", true);
        ClienteProxy cliente = new ClienteProxy(2);

        assertEquals(Arrays.asList(150.0f), cliente.obterValorConsultas(funcionario));
    }

    @Test
    void deveRetornarExcecaoFuncionárioNãoAutorizado(){
        try{
            Funcionario funcionario = new Funcionario("José", false);
            ClienteProxy cliente = new ClienteProxy(2);

            cliente.obterValorConsultas(funcionario);
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Funcionário não é administrado. Acesso recusado!", e.getMessage());
        }
    }

}