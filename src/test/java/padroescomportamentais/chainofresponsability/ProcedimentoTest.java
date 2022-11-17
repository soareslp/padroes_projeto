package padroescomportamentais.chainofresponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProcedimentoTest {

    FuncionarioCirurgiao cirurgiao;
    FuncionarioRadiologista radiologista;
    FuncionarioAnestesista anestesista;
    FuncionarioVeterinario veterinario;


    @BeforeEach
    void setUp() {
        cirurgiao = new FuncionarioCirurgiao(null);
        radiologista = new FuncionarioRadiologista(cirurgiao);
        anestesista = new FuncionarioAnestesista(radiologista);
        veterinario = new FuncionarioVeterinario(anestesista);
    }

    @Test
    void deveRetornarVeterinarioParaRealizarProcedimentoConsulta() {
        assertEquals("Veterinário", veterinario.realizarProcedimento(new Procedimento(TipoProcedimentoConsulta.getTipoProcedimentoConsulta())));
    }

    @Test
    void deveRetornarRadiologistaParaRealizarProcedimentoRaioX() {
        assertEquals("Radiologista", veterinario.realizarProcedimento((new Procedimento(TipoProcedimentoRaioX.getTipoProcedimentoRaioX()))));
    }

    @Test
    void deveRetornarCirurgiãoParaRealizarProcedimentoCirugia() {
        assertEquals("Cirurgião", veterinario.realizarProcedimento(new Procedimento(TipoProcedimentoCirurgia.getTipoProcedimentoCirurgia())));
    }

    @Test
    void deveRetornarAnestesistaParaRealizarProcedimento() {
        assertEquals("Anestesista", veterinario.realizarProcedimento(new Procedimento(TipoProcedimentoAnestesia.getTipoProcedimentoAnestesia())));
    }

    @Test
    void deveRetornarProcedimentoNãoRealizado() {
        assertEquals("Procedimento não realizado", veterinario.realizarProcedimento(new Procedimento(TipoProcedimentoUltrassom.getTipoProcedimentoUltrassom())));
    }

}