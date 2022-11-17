package padroescomportamentais.command;

public class FinalizacaoProcedimentoTarefa implements Tarefa{

    private Procedimento procedimento;

    public FinalizacaoProcedimentoTarefa(Procedimento procedimento){
        this.procedimento = procedimento;
    }

    @Override
    public void executar() {
        this.procedimento.finalizarProcedimento();
    }

    @Override
    public void cancelar() {
        this.procedimento.executarProcedimento();
    }
}
