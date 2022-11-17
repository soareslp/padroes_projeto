package padroescomportamentais.chainofresponsability;

public class FuncionarioCirurgiao extends Funcionario{

    public FuncionarioCirurgiao(Funcionario responsavel) {
        listaProcedimentos.add(TipoProcedimentoCirurgia.getTipoProcedimentoCirurgia());
        setFuncionarioResponsavel(responsavel);
    }

    @Override
    public String getDescricaoCargo() {
        return "Cirurgião";
    }
}
