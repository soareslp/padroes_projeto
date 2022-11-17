package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FuncionarioAtendenteTest {

    @Test
    void deveRetonarSalario() {
        FuncionarioAtendente funcionario = new FuncionarioAtendente();
        funcionario.setSalario(1000);
        assertEquals(1300, funcionario.verificarBonus());
    }

    @Test
    void deveRetornarInformacoes() {
        FuncionarioAtendente funcionario = new FuncionarioAtendente();
        funcionario.setCpf("1");
        funcionario.setNome("Lucas");
        funcionario.setSalario(1000);
        assertEquals("Funcionário{cpf=1, nome='Lucas', salário bônus=1300.0}", funcionario.getInfo());
    }

}