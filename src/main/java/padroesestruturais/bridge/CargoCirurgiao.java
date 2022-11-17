package padroesestruturais.bridge;

public class CargoCirurgiao extends Cargo{

    public CargoCirurgiao(float salarioBase){
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase * (1 + this.formacao.percentualAumento());
    }
}
