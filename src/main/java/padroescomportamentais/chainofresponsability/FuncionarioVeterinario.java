package padroescomportamentais.chainofresponsability;

public class FuncionarioVeterinario extends Funcionario {

    public FuncionarioVeterinario(Funcionario responsavel) {
        listaProcedimentos.add(TipoProcedimentoConsulta.getTipoProcedimentoConsulta());
        setFuncionarioResponsavel(responsavel);
    }

    @Override
    public String getDescricaoCargo() {
        return "Veterinário";
    }
}
