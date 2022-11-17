package padroescomportamentais.templatemethod;

public class FuncionarioAtendente extends Funcionario{


    @Override
    public float verificarBonus() {
        float salarioBonus = (float) (this.getSalario() * 1.3);
        return salarioBonus;
    }
}
