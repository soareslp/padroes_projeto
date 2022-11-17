package padroescomportamentais.command;

public class AgendaProcedimentoTarefa implements Tarefa {

    private Procedimento procedimento;

    public AgendaProcedimentoTarefa(Procedimento procedimento){
        this.procedimento = procedimento;
    }

    @Override
    public void executar() {
        this.procedimento.agendarProcedimento();
    }

    @Override
    public void cancelar() {
        this.procedimento.executarProcedimento();
    }
}
