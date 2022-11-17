package padroesestruturais.bridge;

public class CargoAdministrativo extends Cargo{

    public CargoAdministrativo(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase;
    }
}
