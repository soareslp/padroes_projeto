package singleton;

public class Animal {
    private Animal(){};
    private static Animal instance = new Animal();
    public static Animal getInstance(){
        return instance;
    }

    private String nomeAnimal;
    private float pesoAnimal;

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public float getPesoAnimal() {
        return pesoAnimal;
    }

    public void setPesoAnimal(float pesoAnimal) {
        this.pesoAnimal = pesoAnimal;
    }
}
