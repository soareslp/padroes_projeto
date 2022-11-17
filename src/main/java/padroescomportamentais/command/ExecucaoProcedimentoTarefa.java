package padroescomportamentais.command;

public class ExecucaoProcedimentoTarefa implements Tarefa{

    private Procedimento procedimento;

    public ExecucaoProcedimentoTarefa(Procedimento procedimento){
        this.procedimento = procedimento;
    }

    @Override
    public void executar() {
        this.procedimento.executarProcedimento();
    }

    @Override
    public void cancelar() {
        this.procedimento.agendarProcedimento();
    }
}
