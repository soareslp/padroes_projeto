package padroescomportamentais.templatemethod;

public class FuncionarioVeterinario extends Funcionario{


    @Override
    public float verificarBonus() {
        float salarioBonus = (float) (this.getSalario() * 1.5);
        return salarioBonus;
    }
}
