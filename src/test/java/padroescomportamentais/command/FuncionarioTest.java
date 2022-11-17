package padroescomportamentais.command;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FuncionarioTest {

    Funcionario funcionario;
    Procedimento procedimento;

    @BeforeEach
    void setUp(){
        funcionario = new Funcionario();
        procedimento = new Procedimento("Cirurgia");
    }

    @Test
    void deveAgendarProcedimento(){
        Tarefa angedarProcedimento = new AgendaProcedimentoTarefa(procedimento);
        funcionario.executarTarefa(angedarProcedimento);

        assertEquals("Procedimento agendado!", procedimento.getSituacao());
    }

    @Test
    void deveExecutarProcedimento() {

        Tarefa executarProcedimento = new ExecucaoProcedimentoTarefa(procedimento);
        funcionario.executarTarefa(executarProcedimento);

        assertEquals("Procedimento realizado!", procedimento.getSituacao());
    }

    @Test
    void deveFinalizarProcedimento() {

        Tarefa finalizarProcedimento = new FinalizacaoProcedimentoTarefa(procedimento);
        funcionario.executarTarefa(finalizarProcedimento);

        assertEquals("Procedimento finalizado!", procedimento.getSituacao());
    }

    @Test
    void deveCancelarExecuçãoProcedimento() {

        Tarefa agendarProcedimento = new AgendaProcedimentoTarefa(procedimento);
        Tarefa executarProcedimento = new ExecucaoProcedimentoTarefa(procedimento);
        Tarefa finalizarProcedimento = new FinalizacaoProcedimentoTarefa(procedimento);

        funcionario.executarTarefa(agendarProcedimento);
        funcionario.executarTarefa(executarProcedimento);
        funcionario.executarTarefa(finalizarProcedimento);

        funcionario.cancelarUltimaTarefa();

        assertEquals("Procedimento realizado!", procedimento.getSituacao());
    }
}