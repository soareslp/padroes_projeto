package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CargoRadiologistaTest {


    @Test
    void deveRetornarSalarioRadiologistaComTécnico() {
        Formacao formacao = new FormacaoTecnico();
        CargoRadiologista radiologista = new CargoRadiologista(3000.0f);
        radiologista.setFormacao(formacao);
        assertEquals(3300.0f, radiologista.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioRadiologistaComGraduacao() {
        Formacao formacao = new FormacaoGraduação();
        CargoRadiologista radiologista = new CargoRadiologista(3000.0f);
        radiologista.setFormacao(formacao);
        assertEquals(3600.0f, radiologista.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioRadiologistaComMestrado() {
        Formacao formacao = new FormacaoMestrado();
        CargoRadiologista radiologista = new CargoRadiologista(3000.0f);
        radiologista.setFormacao(formacao);
        assertEquals(4200.0f, radiologista.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioRadiologistaComDoutorado() {
        Formacao formacao = new FormacaoDoutorado();
        CargoRadiologista radiologista = new CargoRadiologista(3000.0f);
        radiologista.setFormacao(formacao);
        assertEquals(5100.0f, radiologista.calcularSalario(), 0.01f);
    }
}