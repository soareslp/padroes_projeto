package padroescomportamentais.chainofresponsability;

public class FuncionarioAnestesista extends Funcionario{

    public FuncionarioAnestesista(Funcionario responsavel) {
        listaProcedimentos.add(TipoProcedimentoAnestesia.getTipoProcedimentoAnestesia());
        setFuncionarioResponsavel(responsavel);
    }

    @Override
    public String getDescricaoCargo() {
        return "Anestesista";
    }
}
