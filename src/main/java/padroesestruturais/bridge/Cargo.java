package padroesestruturais.bridge;

public abstract class Cargo {

    protected Formacao formacao;
    protected float salarioBase;

    public Cargo(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setFormacao(Formacao formacao) {
        this.formacao = formacao;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract float calcularSalario();
}
