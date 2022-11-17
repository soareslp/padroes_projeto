package padroescriacao.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioBuilderTest {

    @Test
    void deveRetornarExcecaoParaFuncionarioSemNome() {
        try {
            FuncionarioBuilder funcionarioBuilder = new FuncionarioBuilder();
            Funcionario funcionario = funcionarioBuilder
                    .setCpf("1")
                    .setTurno("Noturno")
                    .setCargo("Atendente")
                    .setSalario(1500)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaFuncionarioSemCpf() {
        try {
            FuncionarioBuilder funcionarioBuilder = new FuncionarioBuilder();
            Funcionario funcionario = funcionarioBuilder
                    .setNome("1")
                    .setCargo("Atendente")
                    .setTurno("Noturno")
                    .setSalario(1500)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Cpf inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaFuncionarioSemCargo() {
        try {
            FuncionarioBuilder funcionarioBuilder = new FuncionarioBuilder();
            Funcionario funcionario = funcionarioBuilder
                    .setNome("Lucas")
                    .setCpf("1")
                    .setTurno("Noturno")
                    .setSalario(1500)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Cargo inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaFuncionarioSemTurno() {
        try {
            FuncionarioBuilder funcionarioBuilder = new FuncionarioBuilder();
            Funcionario funcionario = funcionarioBuilder
                    .setNome("Lucas")
                    .setCpf("1")
                    .setCargo("Atendente")
                    .setSalario(1500)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Turno inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarFuncionarioValido() {
        FuncionarioBuilder funcionarioBuilder = new FuncionarioBuilder();
        Funcionario funcionario = funcionarioBuilder
                .setNome("Lucas")
                .setCpf("1")
                .setCargo("Atendente")
                .setTurno("Noturno")
                .setSalario(1500)
                .build();

        assertNotNull(funcionario);
    }
}