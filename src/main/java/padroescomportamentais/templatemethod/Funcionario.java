package padroescomportamentais.templatemethod;

public abstract class Funcionario {

    private String cpf;
    private String nome;
    private float salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public abstract float verificarBonus();

    public String getTipo(){ return "Funcionário"; }

    public String getInfo(){
        return getTipo() + "{" +
                "cpf=" + this.cpf +
                ", nome='" + this.nome + '\'' +
                ", salário bônus=" + this.verificarBonus() +
                '}';
    }
}
