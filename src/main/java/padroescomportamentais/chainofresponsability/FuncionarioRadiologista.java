package padroescomportamentais.chainofresponsability;

public class FuncionarioRadiologista extends Funcionario{

    public FuncionarioRadiologista(Funcionario responsavel) {
        listaProcedimentos.add(TipoProcedimentoRaioX.getTipoProcedimentoRaioX());
        setFuncionarioResponsavel(responsavel);
    }

    @Override
    public String getDescricaoCargo() {
        return "Radiologista";
    }
}
