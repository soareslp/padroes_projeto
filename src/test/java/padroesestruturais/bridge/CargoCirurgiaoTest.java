package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CargoCirurgiaoTest {

    @Test
    void deveRetornarSalarioCirurgiãoComTécnico() {
        Formacao formacao = new FormacaoTecnico();
        CargoCirurgiao cirugiao = new CargoCirurgiao(3000.0f);
        cirugiao.setFormacao(formacao);
        assertEquals(3300.0f, cirugiao.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioCirurgiãoComGraduacao() {
        Formacao formacao = new FormacaoGraduação();
        CargoCirurgiao cirugiao = new CargoCirurgiao(3000.0f);
        cirugiao.setFormacao(formacao);
        assertEquals(3600.0f, cirugiao.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioCirurgiãoComMestrado() {
        Formacao formacao = new FormacaoMestrado();
        CargoCirurgiao cirugiao = new CargoCirurgiao(3000.0f);
        cirugiao.setFormacao(formacao);
        assertEquals(4200.0f, cirugiao.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioCirurgiãoComDoutorado() {
        Formacao formacao = new FormacaoDoutorado();
        CargoCirurgiao cirugiao = new CargoCirurgiao(3000.0f);
        cirugiao.setFormacao(formacao);
        assertEquals(5100.0f, cirugiao.calcularSalario(), 0.01f);
    }

}