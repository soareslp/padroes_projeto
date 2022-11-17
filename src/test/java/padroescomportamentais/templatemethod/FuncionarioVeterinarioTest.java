package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FuncionarioVeterinarioTest {

    @Test
    void deveRetonarSalario() {
        FuncionarioVeterinario funcionario = new FuncionarioVeterinario();
        funcionario.setSalario(1000);
        assertEquals(1500, funcionario.verificarBonus());
    }

    @Test
    void deveRetornarInformacoes() {
        FuncionarioVeterinario funcionario = new FuncionarioVeterinario();
        funcionario.setCpf("1");
        funcionario.setNome("Lucas");
        funcionario.setSalario(1000);
        assertEquals("Funcionário{cpf=1, nome='Lucas', salário bônus=1500.0}", funcionario.getInfo());
    }

}