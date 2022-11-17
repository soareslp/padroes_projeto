package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CargoAdministrativoTest {

    @Test
    void deveRetornarSalarioAdministrativoComTécnico() {
        Formacao formacao = new FormacaoTecnico();
        CargoAdministrativo administrativo = new CargoAdministrativo(1000.0f);
        administrativo.setFormacao(formacao);
        assertEquals(1000.0f, administrativo.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioAdministrativoComGraduacao() {
        Formacao formacao = new FormacaoGraduação();
        CargoAdministrativo administrativo = new CargoAdministrativo(1000.0f);
        administrativo.setFormacao(formacao);
        assertEquals(1000.0f, administrativo.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioAdministrativoComMestrado() {
        Formacao formacao = new FormacaoMestrado();
        CargoAdministrativo administrativo = new CargoAdministrativo(1000.0f);
        administrativo.setFormacao(formacao);
        assertEquals(1000.0f, administrativo.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioAdministrativoComDoutorado() {
        Formacao formacao = new FormacaoDoutorado();
        CargoAdministrativo administrativo = new CargoAdministrativo(1000.0f);
        administrativo.setFormacao(formacao);
        assertEquals(1000.0f, administrativo.calcularSalario(), 0.01f);
    }

}