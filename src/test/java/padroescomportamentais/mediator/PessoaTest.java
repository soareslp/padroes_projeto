package padroescomportamentais.mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    void deveEnviarElogioRH() {
        Cliente cliente = new Cliente();
        assertEquals("A Ouvidoria agradece seu contato. \n" +
                        "O setor de RH respondeu sua seguinte mensagem descrita abaixo: \n" +
                        "O setor de RH agradece o recebimento do elogio. Agradecemos o seu contato: Bom atendimento!" ,
                cliente.elogiarRH("Bom atendimento!"));
    }

    @Test
    void deveEnviarReclamacaoRH(){
        Cliente cliente = new Cliente();
        assertEquals("A Ouvidoria agradece seu contato. \n" +
                        "O setor de RH respondeu sua seguinte mensagem descrita abaixo: \n" +
                        "O setor de RH procurará melhorar o seus serviços. Agradecemos o seu contato: Falta de remédios nos consultórios!" ,
                cliente.reclamarRH("Falta de remédios nos consultórios!"));
    }

    @Test
    void deveEnviarSugestaoRH(){
        Cliente cliente = new Cliente();
        assertEquals("A Ouvidoria agradece seu contato. \n" +
                        "O setor de RH respondeu sua seguinte mensagem descrita abaixo: \n" +
                        "O setor de RH irá analizar a sugestão proposta. Agradecemos o seu contato: Poderiam criar uma área de lazer para os animais." ,
                cliente.sugerirRH("Poderiam criar uma área de lazer para os animais."));
    }

    @Test
    void deveEnviarDenunciaRH(){
        Cliente cliente = new Cliente();
        assertEquals("A Ouvidoria agradece seu contato. \n" +
                        "O setor de RH respondeu sua seguinte mensagem descrita abaixo: \n" +
                        "O setor de RH dará toda atenção à sua denúncia. Agradecemos o seu contato: Maus tratos aos animais durante a consulta com veterinário X!" ,
                cliente.denunciarRH("Maus tratos aos animais durante a consulta com veterinário X!"));
    }

}