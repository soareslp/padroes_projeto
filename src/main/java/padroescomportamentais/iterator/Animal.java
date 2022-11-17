package padroescomportamentais.iterator;

public class Animal {

    private String nomeAnimal;
    private boolean cadastrado;

    public Animal(String nomeAnimal, boolean cadastrado) {
        this.nomeAnimal = nomeAnimal;
        this.cadastrado = cadastrado;
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public boolean isCadastrado() {
        return cadastrado;
    }

    public void setCadastrado(boolean cadastrado) {
        this.cadastrado = cadastrado;
    }
}
