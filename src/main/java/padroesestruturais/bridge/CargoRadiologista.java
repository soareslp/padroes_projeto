package padroesestruturais.bridge;

public class CargoRadiologista extends Cargo{

    public CargoRadiologista(float salarioBase){
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase * (1 + this.formacao.percentualAumento());
    }
}
