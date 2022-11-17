package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CargoVeterinarioTest {

    @Test
    void deveRetornarSalarioVeterinárioComTécnico() {
        Formacao formacao = new FormacaoTecnico();
        CargoVeterinario veterinario = new CargoVeterinario(50.0f);
        veterinario.setFormacao(formacao);
        veterinario.setQtdConsultas(6);
        assertEquals(330.0f, veterinario.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioVeterinárioComGraduacao() {
        Formacao formacao = new FormacaoGraduação();
        CargoVeterinario veterinario = new CargoVeterinario(50.0f);
        veterinario.setFormacao(formacao);
        veterinario.setQtdConsultas(6);
        assertEquals(360.0f, veterinario.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioVeterinárioComMestrado() {
        Formacao formacao = new FormacaoMestrado();
        CargoVeterinario veterinario = new CargoVeterinario(50.0f);
        veterinario.setFormacao(formacao);
        veterinario.setQtdConsultas(6);
        assertEquals(420.0f, veterinario.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioVeterinárioComDoutorado() {
        Formacao formacao = new FormacaoDoutorado();
        CargoVeterinario veterinario = new CargoVeterinario(50.0f);
        veterinario.setFormacao(formacao);
        veterinario.setQtdConsultas(6);
        assertEquals(510.0f, veterinario.calcularSalario(), 0.01f);
    }

}