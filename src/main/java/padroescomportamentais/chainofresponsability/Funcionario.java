package padroescomportamentais.chainofresponsability;

import java.util.ArrayList;

public abstract class Funcionario {

    protected ArrayList listaProcedimentos = new ArrayList();
    private Funcionario funcionarioResponsavel;

    public Funcionario getFuncionarioResponsavel() {
        return funcionarioResponsavel;
    }

    public void setFuncionarioResponsavel(Funcionario funcionarioResponsavel) {
        this.funcionarioResponsavel = funcionarioResponsavel;
    }

    public abstract String getDescricaoCargo();

    public String realizarProcedimento(Procedimento procedimento) {
        if (listaProcedimentos.contains(procedimento.getTipoProcedimento())) {
            return getDescricaoCargo();
        }
        else{
            if(funcionarioResponsavel != null){
                return funcionarioResponsavel.realizarProcedimento(procedimento);
            }
            else{
                return "Procedimento não realizado";
            }
        }
    }
}
