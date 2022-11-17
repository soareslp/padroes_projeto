package padroesestruturais.bridge;

public class CargoVeterinario extends Cargo{

    private int qtdConsultas;

    public CargoVeterinario(float salarioBase){
        super(salarioBase);
    }

    public void setQtdConsultas(int qtdConsultas) {
        this.qtdConsultas = qtdConsultas;
    }

    public float calcularSalario() {
        return this.salarioBase * qtdConsultas * (1 + this.formacao.percentualAumento());
    }
}
